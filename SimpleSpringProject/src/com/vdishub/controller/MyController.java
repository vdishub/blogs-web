package com.vdishub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value="/")
	public ModelAndView helloWorld() {
		String message = "This is a simple spring MVC project.";
		return new ModelAndView("home","message",message);
	}

}
