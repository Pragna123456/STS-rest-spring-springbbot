package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Amountresult;
import com.rest.model.Bank;
import com.rest.model.Bank.AccountStatus;
import com.rest.model.Transfer;
import com.rest.repo.BankRepo;


@Service
public class BankServiceImp implements BankService {
	
	@Autowired
	private BankRepo bankRepo;
	
	@Override
	public Bank saveRecord(Bank bank)
	{
		Bank b=bankRepo.save(bank);
		return b;
	}

	@Override
	public Bank getRecord(int accNo, String name, String password) {
     
		Bank b=bankRepo.findById(accNo).get();
		if(b.getAccNo()==accNo && b.getName().equals(name) && b.getPassword().equals(password))
		{
          return b;
		}
		else
		{
			return null;

		}
	}

	@Override
	public Amountresult depositAmount(int accNo, String name, String password, double amount) {
		Bank b1=bankRepo.findById(accNo).get();
		if(accNo==b1.getAccNo() && name.equals(b1.getName()) &&password.equals(b1.getPassword()))
		{
			double previous=b1.getAmount();
			double current=previous+amount;
			b1.setAmount(current);
			bankRepo.save(b1);
			
			Amountresult deposit=new Amountresult();
			deposit.setPrebalance(previous);
			deposit.setTransmoney(amount);
			deposit.setCurrbalance(current);
			return deposit;

		}
		else
		{
		return null;
		}
	}

	@Override
	public Amountresult withdrawAmount(int accNo, String name, String password, double amount) {
		Bank b1=bankRepo.findById(accNo).get();
		if(accNo==b1.getAccNo() && name.equals(b1.getName()) &&password.equals(b1.getPassword())&& amount < b1.getAmount())
		{
			double previous=b1.getAmount();
			double current=previous-amount;
			b1.setAmount(current);
			bankRepo.save(b1);
			
			Amountresult withdraw=new Amountresult();
			withdraw.setPrebalance(previous);
			withdraw.setTransmoney(amount);
			withdraw.setCurrbalance(current);
			return withdraw;

		}
		else
		{
		return null;
		}
	}

	@Override
	public Transfer transferAmount(int accNo, String name, String password, int targetaccount, double amount) {
		Bank b1=bankRepo.findById(accNo).get();
		Bank tb1=bankRepo.findById(targetaccount).get();

	
		if(accNo==b1.getAccNo() && name.equals(b1.getName()) &&password.equals(b1.getPassword())&& targetaccount == tb1.getAccNo() &&amount < b1.getAmount())
		{
		 Transfer details=new Transfer();
			double previous=b1.getAmount();
			double current=previous-amount;
			b1.setAmount(current);
			bankRepo.save(b1);
			
			details.setAccNo(accNo);
		    details.setBalance(previous);
		    details.setTransmoney(amount);
		
		
		    double pre =tb1.getAmount();
		    double cur=pre + amount;
		    tb1.setAmount(cur);
		    bankRepo.save(tb1);
		
		    details.setTargetaccount(targetaccount);
		    details.setPrebalance(pre);
		    details.setCurrbalance(cur);
		
		    return details;
		}
		else
		{
		return null;
		}
	}

	@Override
	public Bank closeAmount(int accNo, String name, String password) {
     
		Bank b1=bankRepo.findById(accNo).get();
		if(accNo==b1.getAccNo() && name.equals(b1.getName()) &&password.equals(b1.getPassword()))
		{
		  b1.setStatus(AccountStatus.inactive);
		  bankRepo.save(b1);
		  return b1;
		}
		else
		{
		return null;
	    }

	}
}