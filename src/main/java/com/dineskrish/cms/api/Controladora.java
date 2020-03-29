package com.dineskrish.cms.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controladora {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("index");

        return model;
    }

    @GetMapping("/ver")
    public ModelAndView ver(){
        ModelAndView model = new ModelAndView("ver");

        return model;
    }

}
