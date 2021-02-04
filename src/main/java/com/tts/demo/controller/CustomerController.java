package com.tts.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CustomerController {

    @GetMapping("/demo")
    public String demo(){
        return "This is the demo!";
    }
    @GetMapping("/dataEntry")
    public String dataEntry(){
        return "SpringBootHtml/dataEntry";
    }
}
