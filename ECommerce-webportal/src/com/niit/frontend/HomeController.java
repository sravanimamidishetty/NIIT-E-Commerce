package com.niit.frontend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {
	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomePage() {

		return "index";
	}

}
