package com.greenfoxacademy.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.authentication.contollers.BucketListRESTController;
import com.greenfoxacademy.authentication.security.AccountCredentials;
import com.greenfoxacademy.authentication.services.BucketListService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(BucketListRESTController.class)
public class AuthenticationApplicationTests {
  
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private BucketListService bucketListService;

  @Test
  public void notExistingPageShouldReturnWith401() throws Exception {

    mockMvc.perform(get("/attractions"))
            .andExpect(status().is(401));
  }


  @Test
  @WithMockUser(username = "admin", password = "{noop}password", roles = "ADMIN")
  public void givenAdminUser_whenGetList_thenOk() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/api/list")
            .accept(MediaType.ALL))
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("")));
  }

}
