package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
//@RequestMapping("/employee/")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("addemp")
	public String addEmployee() {
		return "add-emp-form";
	}
	
	@PostMapping("addemp")
	public String addEmployeePost(Employee emp,Model model) {
		Employee empSaved=empService.saveEmployee(emp);
		model.addAttribute("emp",empSaved);
		model.addAttribute("message","Employee saved Successfully");
		return "add-emp-form";
	}
	
	@GetMapping("allemp")
	public String showAllEmployee(Model model) {
		List<Employee> empList = empService.getAllEmployees();
		model.addAttribute("empList",empList);
		return "all-emp";	
	}
}
