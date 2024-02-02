package com.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private Long mobile;
	private int price;
	private int quantity;
	private double invoice;
	public Customer(int cid, String cname, Long mobile, int price, int quantity, double invoice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobile = mobile;
		this.price = price;
		this.quantity = quantity;
		this.invoice = invoice;
	}
	public double getInvoice() {
		return invoice;
	}
	public void setInvoice(double invoice) {
		this.invoice = invoice;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, Long mobile, int price, int quantity) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobile = mobile;
		this.price = price;
		this.quantity = quantity;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mobile=" + mobile + ", price=" + price + ", quantity="
				+ quantity + ", invoice=" + invoice + "]";
	}
	
}