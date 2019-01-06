package com.ixpert.demohtmlvertical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping(value = {"/", "/home"})
    public String home(){
        return "/index";
    }





}
