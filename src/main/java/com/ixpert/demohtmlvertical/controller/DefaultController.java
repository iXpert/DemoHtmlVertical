package com.ixpert.demohtmlvertical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping(value = {"/", "/home"})
    public String home(){
        return "/index";
    }


    @GetMapping(value = "/newAuthor")
    public String newAuthor(){
        return "/newAuthor";
    }

    @GetMapping(value = "/listAuthors")
    public String listAuthors(){
        return "/listAuthors";
    }

    @GetMapping(value = "/listCategories")
    public String listCategories(){
        return "/listCategories";
    }

    @GetMapping(value = "/newCategory")
    public String newCategory(){
        return "/newCategory";
    }

    @GetMapping(value = "/newBook")
    public String newBook(){
        return "/newBook";
    }

    @GetMapping(value = "/listBooks")
    public String listBooks(){
        return "/listBooks";
    }





}
