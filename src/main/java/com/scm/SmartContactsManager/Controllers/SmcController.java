package com.scm.SmartContactsManager.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SmcController {
	
	@GetMapping("home")
	public ModelAndView homePage() {
		return new ModelAndView("homePage");
	}

}
