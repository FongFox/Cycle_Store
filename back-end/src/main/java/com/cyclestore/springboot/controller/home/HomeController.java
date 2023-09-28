package com.cyclestore.springboot.controller.home;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController implements IHomeRESTController {
    @Override
    public String sayHello() {
        return (
                "Hello World From Spring boot!\n" +
                        "======>>>> Testing Complete!!!"
        );
    }
}
