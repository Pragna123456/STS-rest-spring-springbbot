package com.sathya.users.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employees01 {
	@Id
	private int id;
	@Column
	private String name;
	private String desination ;
	private String email;
	private long mobile;
	private String gender;
	private String city;
	private String state;
	private String country;
	private String address;
	@Override
	public String toString() {
		return "Employees01 [id=" + id + ", name=" + name + ", desination=" + desination + ", email=" + email
				+ ", mobile=" + mobile + ", gender=" + gender + ", city=" + city + ", state=" + state + ", country="
				+ country + ", address=" + address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesination() {
		return desination;
	}
	public void setDesination(String desination) {
		this.desination = desination;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employees01(int id, String name, String desination, String email, long mobile, String gender, String city,
			String state, String country, String address) {
		super();
		this.id = id;
		this.name = name;
		this.desination = desination;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.city = city;
		this.state = state;
		this.country = country;
		this.address = address;
	}
	public Employees01() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}
