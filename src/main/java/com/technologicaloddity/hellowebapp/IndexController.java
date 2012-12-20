package com.technologicaloddity.hellowebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value="/index.html")
	public String handleRequest(Model model) {
		model.addAttribute("message", "You shall not survive<br>Make your time");
		return "index";
	}
	
}
