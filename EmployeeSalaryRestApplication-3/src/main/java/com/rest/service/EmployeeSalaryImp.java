package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;
import org.springframework.stereotype.Service;

import com.rest.model.Employee;
import com.rest.repo.EmployeeRepo;

@Service
public class EmployeeSalaryImp implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	@Override
	public Employee saveRecord(Employee employee) {

		double salary=employee.getSalary();
		
		double da=0.0,ta=0.0,hra=0.0,pf=0.0;
		double invoice=employee.getInvoice();
		
		if(salary<3000)
		{
			ta=0.07;
			da=0.09;
			hra=0.11;
			pf=0.15;
		}


		else if(salary>=3000&&salary<5000)
		{
			ta=0.12;
			da=0.13;
			hra=0.17;
			pf=0.22;
		}

		else 
		{
			ta=0.17;
			da=0.19;
			hra=0.21;
			pf=0.25;
		}
 
		ta=ta*salary;
		da=da*salary;
		hra=hra*salary;
		pf=pf*salary;
		
		invoice=ta+hra+da-pf;
		
		employee.setInvoice(invoice);
		Employee e=employeeRepo.save(employee);
		
		return e;
	}

	@Override
	public Employee getOneRecord(int eid) {
     Employee employee=employeeRepo.findById(eid).get();
		return employee;
	}

	@Override
	public List<Employee> getAllRecords() {
   List<Employee>employees=employeeRepo.findAll();
		
		return employees;
	}

	@Override
	public Employee updateRecord(Employee employee, int eid) {
    
		Employee oldRecord=employeeRepo.findById(eid).get();
		oldRecord.setEname(employee.getEname());
		oldRecord.setSalary(employee.getSalary());
	
double salary=employee.getSalary();
		
		double da=0.0,ta=0.0,hra=0.0,pf=0.0;
		double invoice=employee.getInvoice();
		
		if(salary<3000)
		{
			ta=0.07;
			da=0.09;
			hra=0.11;
			pf=0.15;
		}


		else if(salary>=3000&&salary<5000)
		{
			ta=0.12;
			da=0.13;
			hra=0.17;
			pf=0.22;
		}

		else 
		{
			ta=0.17;
			da=0.19;
			hra=0.21;
			pf=0.25;
		}
 
		ta=ta*salary;
		da=da*salary;
		hra=hra*salary;
		pf=pf*salary;
		
		invoice=ta+hra+da-pf;
		
		oldRecord.setSalary(salary);
		oldRecord.setInvoice(invoice);
		
		Employee e=employeeRepo.save(oldRecord);
		
		return e;
	}

	@Override
	public void deleteRecord(int eid) {
     employeeRepo.deleteById(eid);
	}

}
