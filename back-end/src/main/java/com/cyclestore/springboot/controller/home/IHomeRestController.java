package com.cyclestore.springboot.controller.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface IHomeRestController {
    @GetMapping("/")
    String sayHello();
}
