package com.rest.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int accNo;
	private String name;
	private String password;
	private double amount;
	private String address;
	private long mobile;
	
	@Enumerated(EnumType.STRING)
	private AccountStatus status = AccountStatus.active;
	
	public enum AccountStatus
	{
		active, inactive
	}
	
	
	
	public Bank(int accNo, String name, String password, double amount, String address, long mobile,
			AccountStatus status) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobile = mobile;
		this.status = status;
	}
	public AccountStatus getStatus() {
		return status;
	}
	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int accNo, String name, String password, double amount, String address, long mobile) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobile = mobile;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", password=" + password + ", amount=" + amount
				+ ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	

}