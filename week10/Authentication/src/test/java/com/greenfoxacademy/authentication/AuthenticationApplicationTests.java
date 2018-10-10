package com.greenfoxacademy.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.authentication.contollers.BucketListRESTController;
import com.greenfoxacademy.authentication.security.AccountCredentials;
import com.greenfoxacademy.authentication.services.BucketListService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
//@ContextConfiguration
@WebMvcTest(BucketListRESTController.class)
//@WebAppConfiguration
public class AuthenticationApplicationTests {

//  String contentType = MediaType.APPLICATION_JSON + ";charset=UTF-8";
//
//  @Autowired
//  private WebApplicationContext context;

//  @Autowired
//  private Filter springSecurityFilterChain;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private BucketListService bucketListService;
//
//  @Before
//  public void setup() {
//    mockMvc = MockMvcBuilders
//            .webAppContextSetup(context)
//            .addFilters(springSecurityFilterChain)
//            .build();
//  }


  @Test
  public void notExistingPageShouldReturnWith401() throws Exception {

    mockMvc.perform(get("/attractions"))
            .andExpect(status().is(401));
  }

//  @Test
//  public void loginShouldReturnWithOK_when_validUser() throws Exception {
//
//    ObjectMapper objectMapper = new ObjectMapper();
//    AccountCredentials accountCredentials = new AccountCredentials("admin", "password");
//    String user = objectMapper.writeValueAsString(accountCredentials);
//
//    mockMvc.perform(post("/login")
//            .content(user))
//            .andExpect(status().isOk());
//  }

  //@WithMockUser(value = "test", password = "pass")

}
