package com.greenfoxacademy.auth.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.greenfoxacademy.auth.repository.RoleRepository;
import com.greenfoxacademy.auth.repository.UserRepository;
import com.greenfoxacademy.auth.security.JwtProvider;
import com.greenfoxacademy.auth.security.JwtResponse;
import com.greenfoxacademy.auth.security.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/login")
public class AuthController {

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

}