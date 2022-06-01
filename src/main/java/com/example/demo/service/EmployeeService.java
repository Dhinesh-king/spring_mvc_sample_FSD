package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo empRepo;
	
	public Employee saveEmployee(Employee emp) {
		return empRepo.save(emp);
	}
	
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	
	public Employee getEmployeeById(Integer id) {
		return empRepo.findById(id).get();
	}
	
	public String deleteEmployee(Integer id) {
		empRepo.deleteById(id);
		return "Data Deleted Successfully";
	}
}
