package com.sathya.service;


	

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.model.Student;
import com.sathya.student.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
     @Autowired
	private StudentRepo repo;
	
	@Override
	public Student saveStudent(Student student) {
		int tot=0; 
		  double p=0.0; 
		  String g=null,r=null; 
		  tot=student.getHibernate()+student.getSpring()+student.getSpringboot(); 
		  p=tot/3; 
		  if(p>=70) 
		  { 
		   g="A grade"; 
		  } 
		  else if(p>=60) 
		  { 
		   g="B grade"; 
		  } 
		  else if(p>=50) 
		  { 
		   g="C grade"; 
		  } 
		  else 
		  { 
		   g="D grade"; 
		  } 
		  if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringboot()>=35) 
		{ 
		 r="Pass"; 
		} 
		  else 
		  { 
		   r="Fail"; 
		  } 
		  student.setTotal(tot); 
		  student.setPercentage(p); 
		  student.setGrade(g); 
		  student.setResult(r); 
		  Student save=repo.save(student); 
		  return save;
	}
	
	@Override
	public List<Student> getAllStudent() {
		
		List<Student> list=repo.findAll();
		return list;
	}
	
	@Override
	public void deleteStudent(int stdRollNo) {
		
		repo.deleteById(stdRollNo);

	}
	@Override
	public Student getStudent(int stdRollNo) {
		Student get=repo.findById(stdRollNo).get();
		return get;
	}	


	@Override
	public Student updateStudent(Student student) {
		int tot=0; 
		  double p=0.0; 
		  String g=null,r=null; 
		  tot=student.getHibernate()+student.getSpring()+student.getSpringboot(); 
		  p=tot/3; 
		  if(p>=70) 
		  { 
		   g="A grade"; 
		  } 
		  else if(p>=60) 
		  { 
		   g="B grade"; 
		  } 
		  else if(p>=50) 
		  { 
		   g="C grade"; 
		  } 
		  else 
		  { 
		   g="D grade"; 
		  } 
		  if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringboot()>=35) 
		{ 
		 r="Pass"; 
		} 
		  else 
		  { 
		   r="Fail"; 
		  } 
		  student.setTotal(tot); 
		  student.setPercentage(p); 
		  student.setGrade(g); 
		  student.setResult(r); 
		  Student save=repo.save(student); 
		  return save;
	}

	

	

	
}
