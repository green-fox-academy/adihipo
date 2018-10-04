package com.greenfoxacademy.p2p;

import com.greenfoxacademy.p2p.controller.MainRESTController;
import com.greenfoxacademy.p2p.service.MainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MainRESTController.class)
public class P2pApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private MainService mainService;

  @Test
  public void showMessagesByIdRestShouldReturnWithIAMATEAPOT_when_NoTextFoundById() throws Exception {

    long textId = 100;

    when(mainService.isTextIdExist(textId)).thenReturn(false);

    mockMvc.perform(get("/api/messages/id/100"))
            .andExpect(status().is(418));
  }

}
