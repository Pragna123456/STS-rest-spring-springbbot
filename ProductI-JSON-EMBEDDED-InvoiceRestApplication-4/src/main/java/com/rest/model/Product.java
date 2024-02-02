package com.rest.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int pid;
    private String pname;
    private String ptype;
    private String pcategory;
    private double price;

    @Embedded
    private Charges charges;

    private double finalprice;

	
	public Product(int pid, String pname, String ptype, String pcategory, double price, Charges charges,
			double finalprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.pcategory = pcategory;
		this.price = price;
		this.charges = charges;
		this.finalprice = finalprice;
	}
	public Charges getcharges() {
		return charges;
	}
	public void setCharges(Charges charges) {
		this.charges = charges;
	}
    public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getFinalprice() {
		return finalprice;
	}
	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}
	public Product(int pid, String pname, String ptype, String pcategory, double price, double finalprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.pcategory = pcategory;
		this.price = price;
		this.finalprice = finalprice;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", pcategory=" + pcategory + ", price="
				+ price + ", discount=" + charges + ", finalprice=" + finalprice + "]";
	}
	

}