package com.nnjung.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String indexPage() {
		
		return "other";
	}

	
	
//	@RequestMapping(value = "/home", method = RequestMethod.GET)
//	public String indexPage(@RequestParam("id") String id, Model md) {
//		md.addAttribute("id", id);
//		
//		return "other";
//	}
//	
	
}
