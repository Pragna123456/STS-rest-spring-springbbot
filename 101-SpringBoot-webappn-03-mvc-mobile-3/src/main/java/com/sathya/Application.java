package com.sathya;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sathya.entity.Mobile12;
import com.sathya.repo.MobileRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private MobileRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Mobile12 m1=new Mobile12(10,"qa","pr",39,63,"osa","uy",41,30,30,243);
		//repo.save(m1);
		
		//System.out.println("students recorded inserted..");
		
		//System.out.println(" get one students recorded ..");
		//Mobile12 getone=repo.findById(4).get();
		//System.out.println("data selected.."+getone);

			//System.out.println(" get all students recorded ..");
			//List<Mobile12> listofstudents=(List<Mobile12>)repo.findAll();
		  //  System.out.println(listofstudents);
		
		//System.out.println("deleted one record");
		//repo.deleteById(4);
		//System.out.println("data deleted..");
		
		System.out.println("updated recors...");
		Mobile12 old=repo.findById(10).get();
		Mobile12 newdata=new Mobile12();
		newdata.setCname("naveenbubu");
		newdata.setPname("java full stack");
		newdata.setPrice(977.0);
		old.setCname(newdata.getCname());
		old.setPname(newdata.getPname());
		old.setPrice(newdata.getPrice());
		repo.save(old);
		System.out.println("data updated scussefully...");
	
	}
}

