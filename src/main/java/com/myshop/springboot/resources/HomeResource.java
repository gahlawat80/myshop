package com.myshop.springboot.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/myshop/v1")
public class HomeResource {
	
	@GetMapping("/home")
	public String homePage(Model model){
		return "index";
	}

}
