package com.scm.SmartContactsManager.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.scm.SmartContactsManager.Entitys.User;

@RestController
public class SmcController {
	
	@GetMapping("home")
	public ModelAndView homePage() {
		return new ModelAndView("homePage");
	}
	
	@GetMapping("register")
	public ModelAndView signUpPage() {
		User user = new User();
		ModelAndView mv = new ModelAndView("signup");
		mv.addObject("user", user);
		return mv;
	}
	
	@PostMapping("register")
	public ModelAndView registerationData(@ModelAttribute("user") User user) {
		
		return new ModelAndView("redirect:/home");
	}

}
