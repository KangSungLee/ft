package com.example.ft.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController  {

     @RequestMapping(value = {"/ft/**", "/ft", "/"})
       public String redirect() {
        return "forward:/index.html";
       }
     
     @RequestMapping(value = "/success")
     public String success() {
      return "forward:/index.html";
     }
     
     @RequestMapping(value = "/fail")
     public String fail() {
      return "forward:/index.html";
     }
     
     @RequestMapping(value = "/item/detail/{id}")
     public String itemDetail(@PathVariable("id") String id) {
         return "forward:/index.html";
     }
}	