package com.rest.model;

public class Transfer {
	
	private int accNo;
	private double balance;
	private double prebalance;
	private double currbalance;
	private double transmoney;
	private int targetaccount;
	@Override
	public String toString() {
		return "Transfer [accNo=" + accNo + ", balance=" + balance + ", prebalance=" + prebalance + ", currbalance="
				+ currbalance + ", transmoney=" + transmoney + ", targetaccount=" + targetaccount + "]";
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getPrebalance() {
		return prebalance;
	}
	public void setPrebalance(double prebalance) {
		this.prebalance = prebalance;
	}
	public double getCurrbalance() {
		return currbalance;
	}
	public void setCurrbalance(double currbalance) {
		this.currbalance = currbalance;
	}
	public double getTransmoney() {
		return transmoney;
	}
	public void setTransmoney(double transmoney) {
		this.transmoney = transmoney;
	}
	public int getTargetaccount() {
		return targetaccount;
	}
	public void setTargetaccount(int targetaccount) {
		this.targetaccount = targetaccount;
	}
	public Transfer(int accNo, double balance, double prebalance, double currbalance, double transmoney,
			int targetaccount) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.prebalance = prebalance;
		this.currbalance = currbalance;
		this.transmoney = transmoney;
		this.targetaccount= targetaccount;
	}
	public Transfer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
