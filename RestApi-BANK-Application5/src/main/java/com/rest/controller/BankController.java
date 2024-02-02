package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Amountresult;
import com.rest.model.Bank;
import com.rest.model.Transfer;
import com.rest.service.BankService;

@RestController
public class BankController {

	@Autowired
	private BankService bankService;

	@PostMapping("/save")
	public String saveData(@RequestBody Bank bank) {
		Bank b1 = bankService.saveRecord(bank);
		String message = "";
		if(b1!=null) {
			message = "Data inserted successfully";
		}
		else {
			message ="Data insertion failed";
		}
		return message;
	}
	
	@GetMapping("/balance/{accNo}/{name}/{password}")
	public Bank balanceCheck(@PathVariable int accNo,@PathVariable String name,@PathVariable String password)
	{
		Bank b=bankService.getRecord(accNo, name, password);
		
		if(b !=null)
		{
		  return b;
		}
		else
		{
			return null;
		}
		
	}
	
	@PostMapping("/deposit/{accNo}/{name}/{password}/{amount}")
	public Amountresult depositAmount(@PathVariable  int accNo,@PathVariable String name,@PathVariable String password,@PathVariable double amount)
	{
		Amountresult a=bankService.depositAmount(accNo, name, password, amount);
		if(a !=null)
		{
			  return a;
		}
			else
			{
				return null;
			}
	}  
	
	@PostMapping("/withdraw/{accNo}/{name}/{password}/{amount}")
	public Amountresult withdrawAmount(@PathVariable  int accNo,@PathVariable String name,@PathVariable String password,@PathVariable double amount)
	{
		Amountresult a=bankService.withdrawAmount(accNo, name, password, amount);
		if(a !=null)
		{
			  return a;
		}
			else
			{
				return null;
			}
	}  
	
	
	@PostMapping("/transfer/{accNo}/{name}/{password}/{targetaccount}/{amount}")
	public Transfer transferAmount(@PathVariable  int accNo,@PathVariable String name,@PathVariable String password,@PathVariable  int targetaccount,@PathVariable double amount)
	{
		Transfer a=bankService.transferAmount(accNo, name, password,targetaccount ,amount);
		if(a !=null)
		{
			  return a;
		}
			else
			{
				return null;
			}
	}  
	
	
	@GetMapping("/close/{accNo}/{name}/{password}")
	public String closeForm(@PathVariable int accNo,@PathVariable String name,@PathVariable String password)
	{
		Bank b=bankService.getRecord(accNo, name, password);
		
		if(b !=null)
		{
		  return "account is closed";
		}
		else
		{
			return"account is not closed";
		}
		
	}
	
}	
	

