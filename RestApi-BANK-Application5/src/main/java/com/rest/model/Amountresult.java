package com.rest.model;

public class Amountresult {
	
	private double prebalance;
	private double currbalance;
	private double transmoney;
	public Amountresult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Amountresult(double prebalance, double currbalance, double transmoney) {
		super();
		this.prebalance = prebalance;
		this.currbalance = currbalance;
		this.transmoney = transmoney;
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
	@Override
	public String toString() {
		return "Amountresult [prebalance=" + prebalance + ", currbalance=" + currbalance + ", transmoney=" + transmoney
				+ "]";
	}
	

}
