package com.cyclestore.springboot.controller.home;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController implements IHomeRestController{
    @Override
    public String sayHello() {
        return "Hello World From Spring boot! ======>>>> Testing Complete!!!";
    }
}
