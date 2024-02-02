package com.rest.service;

import java.util.List;

import com.rest.model.Amountresult;
import com.rest.model.Bank;
import com.rest.model.Transfer;

public interface BankService {

	public Bank saveRecord(Bank bank);
	public Bank getRecord(int accNo,String name,String password);
	public Amountresult depositAmount(int accNo,String name,String password,double amount);
	public Amountresult withdrawAmount(int accNo,String name,String password,double amount);
	public Transfer transferAmount(int accNo,String name,String password,int targetaccount,double amount);
	public Bank closeAmount(int accNo,String name,String password);

}