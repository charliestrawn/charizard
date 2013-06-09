package com.heroku.charizard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public ModelAndView homeView() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    @RequestMapping(value = "hello", method = GET)
    @ResponseBody
	public String printWelcome() {
		return "hello";
	}

}