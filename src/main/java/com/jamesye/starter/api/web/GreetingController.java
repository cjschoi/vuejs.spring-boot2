package com.jamesye.starter.api.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

  @RequestMapping("/greeting")
  public String greeting() {
    System.out.println("dddddddddddddddddddddddddddd");
    return "greeting";
  }

}
