package com.sathya.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile12 {
	@Id
	private int mno;
	@Column
	private String mname;
	private String cname;
	private int ramsize;
	private int romsize;
	private String osname;
	private String pname;
	private int fsize;
	private int bsize;
	private int imei;
	private double price;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getRamsize() {
		return ramsize;
	}
	public void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}
	public int getRomsize() {
		return romsize;
	}
	public void setRomsize(int romsize) {
		this.romsize = romsize;
	}
	public String getOsname() {
		return osname;
	}
	public void setOsname(String osname) {
		this.osname = osname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getFsize() {
		return fsize;
	}
	public void setFsize(int fsize) {
		this.fsize = fsize;
	}
	public int getBsize() {
		return bsize;
	}
	public void setBsize(int bsize) {
		this.bsize = bsize;
	}
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Mobile12() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile12(int mno, String mname, String cname, int ramsize, int romsize, String osname, String pname,
			int fsize, int bsize, int imei, double price) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.cname = cname;
		this.ramsize = ramsize;
		this.romsize = romsize;
		this.osname = osname;
		this.pname = pname;
		this.fsize = fsize;
		this.bsize = bsize;
		this.imei = imei;
		this.price = price;
	}

}
