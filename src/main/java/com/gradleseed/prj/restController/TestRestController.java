package com.gradleseed.prj.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class TestRestController {

  @GetMapping("/test")
  public String test() {
    return "test";
  }
}
