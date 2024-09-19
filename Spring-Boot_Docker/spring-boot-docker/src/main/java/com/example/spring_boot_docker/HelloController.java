package com.example.spring_boot_docker;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {

    @RequestMapping("/")
  public String home() {
    return "Hello-Docker-World";
  }
    
}
