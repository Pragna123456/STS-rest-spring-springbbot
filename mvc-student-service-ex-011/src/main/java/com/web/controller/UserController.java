package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Student;
import com.web.service.StudentServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private StudentServiceImpl service;
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	@RequestMapping("/addStudent")
	public String studentForm() {
		return "student";
	}
	@RequestMapping("/register")
	public String saveform(Student student) {
		
	Student s= service.saveStudent(student);
		return "success";
	}
	
	@RequestMapping("/viewStudents")
	public String viewAllStudents(ModelMap model)
	{
		model.put("students",service.getAllStudent());
		return "viewStudent";
	}
	@RequestMapping("/delete/{stdRollNo}")
	public String delete(@PathVariable int stdRollNo)
	{
		service.deleteStudent(stdRollNo);
		return "redirect:/viewStudents";
	}
	@RequestMapping("/edit/{stdRollNo}")
	public String edit(@PathVariable int stdRollNo,ModelMap model)
	{
		model.put("command", service.getStudent(stdRollNo));
		return "ediStudent";
	}
	@RequestMapping("/editandsave")
	public String editAndSave(Student student)
	{
		Student edit=service.updateStudent(student);
		return "redirect:/viewStudents";
	}
	

}