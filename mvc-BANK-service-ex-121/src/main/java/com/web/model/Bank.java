package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
	@Id
   private int accno;
   private String name;
   private String password;
   private double amount;
   private String address;
   private long mobile;
   private boolean value;
public Bank() {
	super();
	
}
public Bank(int accno, String name, String password, double amount, String address, long mobile, boolean value) {
	super();
	this.accno = accno;
	this.name = name;
	this.password = password;
	this.amount = amount;
	this.address = address;
	this.mobile = mobile;
	this.value = value;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
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
public boolean isValue() {
	return value;
}
public void setValue(boolean value) {
	this.value = value;
}
@Override
public String toString() {
	return "Bank [accno=" + accno + ", name=" + name + ", password=" + password + ", amount=" + amount + ", address="
			+ address + ", mobile=" + mobile + ", value=" + value + "]";
}
public boolean getValue() {
	return false;
}
}