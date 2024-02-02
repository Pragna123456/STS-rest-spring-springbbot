package com.rest.service;

import java.util.List;

import com.rest.model.Electricity;

public interface ElectricityService {

	public Electricity saveRecord(Electricity electricity);
	public Electricity getOneRecord(int cid);
	public List<Electricity> getAllRecords();
	public Electricity updateRecord(Electricity electricity,int cid);
	public void deleteRecord(int cid);
}