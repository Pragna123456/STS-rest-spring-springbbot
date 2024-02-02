package com.sathya.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book12 {
	@Id
	private int bno;
	@Column
	private String bname;
	private String aname;
	private int isno;
	private String pname;
	private String pyear;
	
	@Override
	public String toString() {
		return "Book12 [bno=" + bno + ", bname=" + bname + ", aname=" + aname + ", isno=" + isno + ", pname=" + pname
				+ ", pyear=" + pyear + ", price=" + price + "]";
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getIsno() {
		return isno;
	}

	public void setIsno(int isno) {
		this.isno = isno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPyear() {
		return pyear;
	}

	public void setPyear(String pyear) {
		this.pyear = pyear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book12() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book12(int bno, String bname, String aname, int isno, String pname, String pyear, double price) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.aname = aname;
		this.isno = isno;
		this.pname = pname;
		this.pyear = pyear;
		this.price = price;
	}

	private double price;
}