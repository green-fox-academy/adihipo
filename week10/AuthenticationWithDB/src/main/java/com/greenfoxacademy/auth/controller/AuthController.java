package com.greenfoxacademy.auth.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.greenfoxacademy.auth.model.Role;
import com.greenfoxacademy.auth.model.RoleName;
import com.greenfoxacademy.auth.model.User;
import com.greenfoxacademy.auth.repository.RoleRepository;
import com.greenfoxacademy.auth.repository.UserRepository;
import com.greenfoxacademy.auth.security.JwtProvider;
import com.greenfoxacademy.auth.security.JwtResponse;
import com.greenfoxacademy.auth.security.LoginForm;
import com.greenfoxacademy.auth.security.SignUpForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/login")
public class AuthController {

  private String errorMessage = "";

  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtProvider jwtProvider;

  @GetMapping("/signin")
  public String showSignIn(Model model) {
    model.addAttribute("loginForm", new LoginForm());
    return "signin";
  }

  @PostMapping("/signin")
  public String authenticateUser(@Valid @ModelAttribute LoginForm loginRequest, HttpServletResponse response) {

    Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                    loginRequest.getUsername(),
                    loginRequest.getPassword()
            )
    );

    SecurityContextHolder.getContext().setAuthentication(authentication);

    String jwt = jwtProvider.generateJwtToken(authentication);
    JwtResponse jwtResponse = new JwtResponse(jwt);
    Cookie cookie = new Cookie("Authorization", jwtResponse.getAccessToken());
    cookie.setPath("/");
    response.addCookie(cookie);
    return "redirect:/test/user";
  }

  @GetMapping("/signup")
  public String showRegisterPage(Model model) {
    model.addAttribute("errorMessage", errorMessage);
    model.addAttribute("signUpForm", new SignUpForm());
    return "signup";
  }

  @PostMapping("/signup")
  public String registerUser(@Valid @ModelAttribute SignUpForm signUpRequest) {
    if (userRepository.existsByUsername(signUpRequest.getUsername())) {
      errorMessage = "Fail -> Username is already taken!";
      return "redirect:/login/signup";
    }

    if (userRepository.existsByEmail(signUpRequest.getEmail())) {
      errorMessage = "Fail -> Email is already in use!";
      return "redirect:/login/signup";
    }

    // Creating user's account
    User user = new User(signUpRequest.getName(), signUpRequest.getUsername(),
            signUpRequest.getEmail(), encoder.encode(signUpRequest.getPassword()));

    Set<String> strRoles = signUpRequest.getRole();
    Set<Role> roles = new HashSet<>();

    strRoles.forEach(role -> {
      switch (role) {
        case "admin":
          Role adminRole = roleRepository.findByName(RoleName.ROLE_ADMIN)
                  .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
          roles.add(adminRole);

          break;
        case "pm":
          Role pmRole = roleRepository.findByName(RoleName.ROLE_PM)
                  .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
          roles.add(pmRole);

          break;
        default:
          Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
                  .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
          roles.add(userRole);
      }
    });

    user.setRoles(roles);
    userRepository.save(user);
    errorMessage = "";

    return "redirect:/login/signin";
  }

}