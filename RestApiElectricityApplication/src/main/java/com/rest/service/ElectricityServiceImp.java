package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Electricity;
import com.rest.repo.ElectricityRepo;


@Service
public class ElectricityServiceImp implements ElectricityService {

	@Autowired
	private ElectricityRepo electricityRepo;
	
	
	
	@Override
	public Electricity saveRecord(Electricity electricity) {
		int uts = 0;
		double total =0.0;
		uts = electricity.getCurrent_reading() - electricity.getPrevious_reading();
		electricity.setUnits(uts);
		if(uts<300) {
			total = uts *1.75;
		}
		else if(uts>=300 && uts<500)
		{
			total = uts *3.75;
		}
		else {
			total = uts * 7.35;
		}
		electricity.setTotalbill(total);
		Electricity e = electricityRepo.save(electricity);
		return e;
	}
		
		
		
		
	

	@Override
	public Electricity getOneRecord(int cid) {
    Electricity electricity=electricityRepo.findById(cid).get();
		return electricity;
	}

	@Override
	public List<Electricity> getAllRecords() {
    List<Electricity>electricities=electricityRepo.findAll();
		
		return electricities;
	}

	@Override
	public Electricity updateRecord(Electricity electricity, int cid) {
    Electricity oldRecord=electricityRepo.findById(cid).get();
	oldRecord.setCname(electricity.getCname());	
	oldRecord.setCurrent_reading(electricity.getCurrent_reading());
	oldRecord.setPrevious_reading(electricity.getPrevious_reading());
	
	int uts = 0;
	double total =0.0;
	uts = electricity.getCurrent_reading() - electricity.getPrevious_reading();
	electricity.setUnits(uts);
	if(uts<300) {
		total = uts *1.75;
	}
	else if(uts>=300 && uts<500)
	{
		total = uts *3.75;
	}
	else {
		total = uts * 7.35;
	}
	oldRecord.setUnits(uts);
	oldRecord.setTotalbill(total);
	Electricity e=electricityRepo.save(oldRecord);
		
		
		return e;
	}

	@Override
	public void deleteRecord(int cid) {
		electricityRepo.deleteById(cid);
	}

}
