package com.sathya;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sathya.entity.Student12;
import com.sathya.repo.StudentRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Student12 s1=new Student12(4,"anishi","java",5687.0);
		//repo.save(s1);
		
		//System.out.println("students recorded inserted..");
		
	//	System.out.println(" get one students recorded ..");
		//Student12 getone=repo.findById(4).get();
		//System.out.println("data selected.."+getone);

			//System.out.println(" get all students recorded ..");
			//List<Student12> listofstudents=(List<Student12>)repo.findAll();
		    //System.out.println(listofstudents);
		
		//System.out.println("deleted one record");
		//repo.deleteById(4);
		//System.out.println("data deleted..");
		
		System.out.println("updated recors...");
		Student12 old=repo.findById(2).get();
		Student12 newdata=new Student12();
		newdata.setStdName("naveenbubu");
		newdata.setCourse("java full stack");
		newdata.setFee(9877.0);
		old.setStdName(newdata.getStdName());
		old.setCourse(newdata.getCourse());
		old.setFee(newdata.getFee());
		repo.save(old);
		System.out.println("data updated scussefully...");
	}

}
