package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sathya.users.entity.Users01;
import com.sathya.users.repo.UsersRepo;

@Controller
public class UserController {
	
	@Autowired
	private UsersRepo repo;
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
		
	}
	@RequestMapping("/adduser")
	public String userForm()
	{
		return "userform";
		
	}
	@RequestMapping("/register")
	public String userDetails(Users01 users01,ModelMap model)
	{
		repo.save(users01);
		return "success";
		
	}
	
	@RequestMapping("/viewuser")
	public String viewAllUserDetails(ModelMap model)
	{
		model.put("users",repo.findAll());
		return "viewform";
	}
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
	    repo.deleteById(id);
	    return "redirect:/viewuser"; // Change to viewusers
	}

	@RequestMapping("/edit/{id}")
	public String editForm(@PathVariable int id, ModelMap model) {
	    model.put("command", repo.findById(id).orElse(null)); // Change to findById(id).orElse(null)
	    return "edituser";
	}
	@RequestMapping("/editandsave")
	public String editAndSave(Users01 users,ModelMap model)
	{   repo.save(users);
		return "redirect:/viewuser";
		
	}

}
	
	


