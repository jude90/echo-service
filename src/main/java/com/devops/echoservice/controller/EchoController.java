package com.devops.echoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jude on 2018/12/5.
 */
@RestController
@RequestMapping("/v1")
public class EchoController {
    @RequestMapping("/echo/{words}")
    public String greet(@PathVariable("words") String words){
        return "Greeting !!! "+ words;
    }

    @RequestMapping("/curse/{words}")
    public String curse(@PathVariable("words") String words){
        return "Fuck you ! Bloody Hell !!! "+ words;
    }
}
