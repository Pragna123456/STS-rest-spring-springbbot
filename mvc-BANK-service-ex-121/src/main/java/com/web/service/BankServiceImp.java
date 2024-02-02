package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Bank;
import com.web.repo.BankRepo;

@Service
public class BankServiceImp implements BankService {

	@Autowired
	private BankRepo repo;
	@Override
	public Bank saveAccount(Bank bank) {
		Bank b=repo.save(bank);
		return b;
	}
	@Override
	public Bank getAccount(int accno) {
		 return repo.findById(accno).get();
		 
	}

	@Override
	public double updatePlusAccount(int accno,double amount ) {
		Bank bank=repo.findById(accno).get();
		bank.setAmount(bank.getAmount()+amount);
		repo.save(bank);
		return bank.getAmount();
	}
	@Override
	public double updateMinusAccount(int accno, double amount) {
		Bank bank=repo.findById(accno).get();
		bank.setAmount(bank.getAmount()-amount);
		repo.save(bank);
		return bank.getAmount();
	}
	@Override
	public boolean closeAccount(int accno) {
		Bank bank=repo.findById(accno).get();
		bank.setValue(false);
		repo.save(bank);
		return bank.getValue();
	}
}