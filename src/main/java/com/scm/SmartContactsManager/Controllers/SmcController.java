package com.scm.SmartContactsManager.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.scm.SmartContactsManager.Entitys.User;
import com.scm.SmartContactsManager.Services.userService;
import com.scm.SmartContactsManager.ServicesImpl.userServiceImpl;

@RestController
public class SmcController {
	
	@Autowired
	private userServiceImpl userSer;
	
	@GetMapping("home")
	public ModelAndView homePage() {
		return new ModelAndView("homePage");
	}
	
	@GetMapping("login")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
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
		User user1 = new User();
		user1.setName(user.getName());
		user1.setEmail(user.getEmail());
		user1.setPhoneNo(user.getPhoneNo());
		user1.setUserName(user.getUserName());
		user1.setPassword(user.getPassword());
		
		userSer.saveNewUser(user1);
		
		return new ModelAndView("redirect:/home");
	}

}
