package com.e_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	@GetMapping("/admin")
	public String adminHome(Model model) {
		
		String name="Shriram";
		
		model.addAttribute("name", name);
		
		return "adminHome";
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "HelloWorld");
		return "HelloWorld";
		}
	
	@GetMapping("/style")
	public String style() {
		return "add-css-js-demo";
	}


}
