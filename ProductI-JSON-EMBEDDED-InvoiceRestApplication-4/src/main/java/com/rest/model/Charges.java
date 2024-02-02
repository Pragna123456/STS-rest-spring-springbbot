package com.rest.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


@Embeddable
public class Charges {
	private String category;
	private double discount;
	private double gst;
	private int charges;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public Charges(String category, double discount, double gst,int charges) {
		super();
		this.category = category;
		this.discount = discount;
		this.gst = gst;
		this.charges = charges;
	}
	public Charges() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Discount [pelectronic=" + category + ", discount=" + discount + ", gst=" + gst + ", charges="
				+ charges + "]";
	}

}
