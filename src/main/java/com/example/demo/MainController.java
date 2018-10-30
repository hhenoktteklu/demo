package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping("/")
    public String homePage(){
        return "homepage";
    }
    @PostMapping("/nextpage")
    public String nextPage(HttpServletRequest request){
        System.out.println(request.getParameter("input"));
        return "redirect:/";
    }
}
