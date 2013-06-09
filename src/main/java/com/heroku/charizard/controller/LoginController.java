package com.heroku.charizard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public ModelAndView loginView() {
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }

}
