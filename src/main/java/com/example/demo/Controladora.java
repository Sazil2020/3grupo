package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Controladora {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("index");

        return model;
    }
    @GetMapping("/ping")
    public ResponseEntity<Object> ping(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("alive", true);
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    @GetMapping("/ver")
    public ModelAndView contact(){
        ModelAndView model = new ModelAndView("ver");
        return model;
    }
    @GetMapping("/Minesweeper")
    public ModelAndView Shar(){
        ModelAndView model = new ModelAndView("Minesweeper");
        return model;
    }
    }


