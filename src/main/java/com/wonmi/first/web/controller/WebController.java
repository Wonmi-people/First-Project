package com.wonmi.first.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@RestController
public class WebController {

    @GetMapping({"/", "/index", "/main"})
    public ModelAndView home(Locale locale,
                             HttpSession session){
        ModelAndView mav = new ModelAndView("/index");
        return mav;
    }
}
