package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sathya.users.entity.Employees01;
import com.sathya.users.repo.EmployeesRepo;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeesRepo repo;
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
		
	}
	@RequestMapping("/addnewemployee")
	public String employeeForm()
	{
		return "employeeform";
		
	}
	@RequestMapping("/register")
	public String employeeDetails(Employees01 employees01,ModelMap model)
	{
		repo.save(employees01);
		return "success";
		
	}
	
	@RequestMapping("/viewallemployees")
	public String viewAllEmployeeDetails(ModelMap model)
	{
		model.put("employees",repo.findAll());
		return "viewform";
	}
	@RequestMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
	    repo.deleteById(id);
	    return "redirect:/viewallemployees"; // Change to viewusers
	}

	@RequestMapping("/edit/{id}")
	public String editForm(@PathVariable int id, ModelMap model) {
	    model.put("command", repo.findById(id).orElse(null)); // Change to findById(id).orElse(null)
	    return "editemployee";
	}
	@RequestMapping("/editandsave")
	public String editAndSave(Employees01 employees,ModelMap model)
	{   repo.save(employees);
		return "redirect:/viewallemployees";
		
	}

}
	
	


