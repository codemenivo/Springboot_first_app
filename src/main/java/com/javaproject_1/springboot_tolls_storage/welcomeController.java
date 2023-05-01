package com.javaproject_1.springboot_tolls_storage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class welcomeController {

    @RequestMapping(" /welcome")
    @ResponseBody
    public String welcome() {
        return "Welcome toSpring boot world!";
    }
}
