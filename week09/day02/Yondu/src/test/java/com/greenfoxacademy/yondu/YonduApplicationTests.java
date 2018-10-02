package com.greenfoxacademy.yondu;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.yondu.controller.ArrowController;
import com.greenfoxacademy.yondu.model.Arrow;
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

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.mockito.ArgumentMatchers.any;

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

    when(arrowService.getErrorMessage()).thenReturn(new ErrorMessage(error));

    mockMvc.perform(post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andExpect(status().is(400))
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is(error)));
  }

  @Test
  public void shouldReturnWithOKAndIAMGROOT_when_givingInput() throws Exception {

    Double distance = 100.0;
    Double time = 10.0;
    Double speedPost = null;
    Double speed = distance / time;

    ObjectMapper objectMapper = new ObjectMapper();
    Arrow arrow = new Arrow(distance, time, speedPost);
    String arrowJson = objectMapper.writeValueAsString(arrow);

    when(arrowService.getArrowData(any())).thenReturn(new Arrow(distance, time, speed));

    mockMvc.perform(post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content(arrowJson))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.distance", is(distance)))
            .andExpect(jsonPath("$.time", is(time)))
            .andExpect(jsonPath("$.speed", is(speed)))
            .andDo(print());

  }

}
