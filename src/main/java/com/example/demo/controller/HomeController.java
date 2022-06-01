package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Employee;
import com.example.demo.controller.dto.UserReqDto;


@Controller
public class HomeController {
	
	@GetMapping("/home")
	public ModelAndView getHome() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Dhinesh");
		return new ModelAndView("home","emp",emp);
	}
	
	@GetMapping("/login")
	public String getLoginpage() {
		return "loginform";
	}
	
	@PostMapping("/login")
	public String getLoginCheck(UserReqDto userReqDto, Model model) {
		
		if(userReqDto.getUsername().equals("Dhinesh")) {
			model.addAttribute("message","The user is valid");
		}
		else {
			model.addAttribute("message","The user is not valid");
		}
		return "loginform";
	}
	
	@GetMapping("/sample")
	public String getSample(Model model,ModelMap modelMap) {
		model.addAttribute("name","Rajesh");
		modelMap.addAttribute("name1","Ganesh");
		return "sample";
	}
}
