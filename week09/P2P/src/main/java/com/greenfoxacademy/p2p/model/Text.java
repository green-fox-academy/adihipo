package com.greenfoxacademy.p2p.model;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
public class Text {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String text;
  private String date;

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private User user;

  public Text(){

  }

  public Text(User user, String text) {
    this.user = user;
    this.text = text;
    date = new SimpleDateFormat("yyyy.MM.dd/HH:mm").format(Calendar.getInstance().getTime());
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

}
