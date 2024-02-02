package com.web.service;

import com.web.model.Bank;

public interface BankService {
	public Bank saveAccount(Bank bank);
    public double updatePlusAccount(int accno,double amount);
	public Bank getAccount(int accno);
	public double updateMinusAccount(int accno,double amount);
    public boolean closeAccount(int accno);
}