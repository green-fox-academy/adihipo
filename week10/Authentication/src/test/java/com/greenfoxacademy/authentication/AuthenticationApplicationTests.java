package com.greenfoxacademy.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.authentication.contollers.BucketListRESTController;
import com.greenfoxacademy.authentication.models.Goal;
import com.greenfoxacademy.authentication.security.AccountCredentials;
import com.greenfoxacademy.authentication.services.BucketListService;
import com.sun.org.apache.xpath.internal.operations.Bool;
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

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(BucketListRESTController.class)
public class AuthenticationApplicationTests {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

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
  public void givenAdminUser_whenShowList_thenOkAndData() throws Exception {

    String text = "Finish authentication";
    Integer dreamLevel = 100;
    Boolean done = true;

    Goal newGoal = new Goal(text, dreamLevel, done);
    List<Goal> goals = new ArrayList<>();
    goals.add(newGoal);

    when(bucketListService.getAllGoalsAsList()).thenReturn(goals);

    mockMvc.perform(MockMvcRequestBuilders.get("/api/list")
            .accept(MediaType.ALL))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$[0].text", is(text)))
            .andExpect(jsonPath("$[0].dreamLevel", is(dreamLevel)))
            .andExpect(jsonPath("$[0].done", is(done)));
  }

  @Test
  @WithMockUser(username = "admin", password = "{noop}password", roles = "ADMIN")
  public void givenAdminUser_whenSaveNewGoal_thenOk() throws Exception {

    String text = "Finish authentication";
    Integer dreamLevel = 100;
    Boolean done = true;

    ObjectMapper objectMapper = new ObjectMapper();
    Goal newGoal = new Goal(text, dreamLevel, done);
    String newGoalAsString = objectMapper.writeValueAsString(newGoal);

    mockMvc.perform(MockMvcRequestBuilders.post("/api/save")
            .contentType(MediaType.ALL)
            .content(newGoalAsString)
            .accept(MediaType.ALL))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.text", is(text)))
            .andExpect(jsonPath("$.dreamLevel", is(dreamLevel)))
            .andExpect(jsonPath("$.done", is(done)));
  }

}
