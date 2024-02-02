package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Bank;
import com.web.service.BankService;

@Controller
public class BankController {

    @Autowired
    private BankService service;

    @RequestMapping("/home")
    public String homepage() {
        return "home";
    }

    @RequestMapping("/newaccount")
    public String openAccount() {
        return "newaccount";
    }

    @RequestMapping("/register")
    public String addCustomerDetails(Bank bank) {
        Bank savedBank = service.saveAccount(bank);
        return "success";
    }

    @RequestMapping("/clear")
    public String clear() {
        return "newaccount";
    }

    @RequestMapping("/balance")
    public String balance() {
        return "balanceform";
    }

    @RequestMapping("/result")
    public String processForm(@RequestParam int accno, Model model) {
        Bank bank = service.getAccount(accno);
        model.addAttribute("bank", bank);
        return "balanceresult"; // Display the record
    }
    @RequestMapping("/deposit")
    public String depositForm()
    {
    	return "depositform";
    }
    
    @RequestMapping("/depositresult")
    public String depositResult(@RequestParam int accno,@RequestParam double amount,ModelMap model)
    {
    	Bank bank=service.getAccount(accno);
    	model.put("oldamount", bank.getAmount());
    	model.put("amount", amount);
    	double newAmount=service.updatePlusAccount(accno, amount);
    	model.put("newamount", newAmount);
    	return "depositres";
    }
    @RequestMapping("/withdraw")
    public String withdrawform()
    {
    	return "withdrawform";
    }
    @RequestMapping("/withdrawresult")
    public String withdrawresult(@RequestParam int accno,@RequestParam double amount,ModelMap model)
    {
    	Bank bank=service.getAccount(accno);
    	model.put("oldamount",bank.getAmount());
    	model.put("amount", amount);
    	double bank1=service.updateMinusAccount(accno, amount);
    	model.put("newamount",bank);
    	return "withdrawres";
    }
    @RequestMapping("/transfer")
    public String transferform()
    {
    	return "transferform";
    }
    @RequestMapping("/transferresult")
    public String transferresult(@RequestParam int accno,@RequestParam double amount,@RequestParam int accno2,ModelMap model)
    {
       model.put("accno",accno);
       Bank bank=service.getAccount(accno);
       model.put("oldamount",bank.getAmount());
       model.put("amount",amount);
       model.put("accno2",accno2);
       Bank bank1=service.getAccount(accno2);
       model.put("oldamount1",bank1.getAmount());
       double bank2bal=service.updatePlusAccount(accno2, amount);
       model.put("bank2bal",bank2bal);
       return "transferres";
    }
    @RequestMapping("/closeaccount")
    public String closeform()
    {
    	return "closeform";
    }
    @RequestMapping("/closeresult")
    public String closeform(@RequestParam int accno,@RequestParam String name,ModelMap model) {
    Boolean value=service.closeAccount(accno);
    model.put("value", value);
    model.put("name", value);
    model.put("accno", value);
    return "closeres";
}
@RequestMapping("/aboutus")
public String aboutus()
{
	return "aboutus";
}
}