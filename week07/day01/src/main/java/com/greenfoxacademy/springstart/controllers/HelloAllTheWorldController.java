package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.GreetingWord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloAllTheWorldController {

  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  private List<GreetingWord> greetingWordList = new ArrayList<>();

  @RequestMapping("/web/greeting/all")
  public String greetAllTheWorld(Model model) {
    for (int i = 0; i < hellos.length; i++) {
      greetingWordList.add(new GreetingWord(hellos[i]));
    }
    model.addAttribute("greetings", greetingWordList);
    return "greetingToAll";
  }
}
