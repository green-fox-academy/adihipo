package com.greenfoxacademy.yondu;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.yondu.controller.ArrowController;
import com.greenfoxacademy.yondu.model.ErrorMessage;
import com.greenfoxacademy.yondu.service.ArrowService;
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
@WebMvcTest(ArrowController.class)
public class YonduApplicationTests {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ArrowService arrowService;

  @Test
  public void shouldReturnWithBADREQUESTAndErrorMessage_when_InputMissing() throws Exception {

    String error = "Please provide distance and time!";

    ObjectMapper objectMapper = new ObjectMapper();
    ErrorMessage errorMessage = new ErrorMessage(error);
    String errorJson = objectMapper.writeValueAsString(errorMessage);

    when(arrowService.getErrorMessage()).thenReturn(new ErrorMessage(error));

    mockMvc.perform(post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content(errorJson))
            .andExpect(status().is(400))
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is(error)));
  }

}
