package com.greenfoxacademy.groot;

import com.greenfoxacademy.groot.controller.GuardianController;
import com.greenfoxacademy.groot.model.ErrorMessage;
import com.greenfoxacademy.groot.model.Messages;
import com.greenfoxacademy.groot.service.GuardianService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GrootApplicationTests {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private GuardianService guardianService;

  @Test
  public void shouldReturnWithOKAndIAMGROOT_when_givingInput() throws Exception {

    String received = "Hello";
    String translated = "I am Groot";

    when(guardianService.getGrootMessage(received)).thenReturn(new Messages(received, translated));

    mockMvc.perform(get("/groot?message=Hello"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.received", is(received)))
            .andExpect(jsonPath("$.translated", is(translated)));
  }

  @Test
  public void shouldReturnWithBADREQUESTAndErrorIAMGROOT_when_NoInput() throws Exception {

    String error = "I am Groot";

    when(guardianService.getErrorMessage()).thenReturn(new ErrorMessage(error));

    mockMvc.perform(get("/groot"))
            .andExpect(status().is(400))
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is(error)));
  }

}
