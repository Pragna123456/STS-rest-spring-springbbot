package com.sathya;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sathya.entity.Book12;
import com.sathya.repo.BookRepo;

@SpringBootApplication
public class Application implements CommandLineRunner 
{
	
	@Autowired
	private BookRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
}

	@Override
	public void run(String... args) throws Exception {
		//Book12 b1=new Book12(5,"dr","ht",05,"uy","9990",93);
		//repo.save(b1);
		
		//System.out.println("students recorded inserted..");
		
		//System.out.println(" get one students recorded ..");
		//Book12 getone=repo.findById(4).get();
		//System.out.println("data selected.."+getone);

			//System.out.println(" get all students recorded ..");
			//List<Book12> listofstudents=(List<Book12>)repo.findAll();
		    //System.out.println(listofstudents);
		
		//System.out.println("deleted one record");
		//repo.deleteById(4);
		//System.out.println("data deleted..");
		
		System.out.println("updated recors...");
		Book12 old=repo.findById(1).get();
		Book12 newdata=new Book12();
		newdata.setAname("na");
		newdata.setPname("java ");
		newdata.setPrice(77.0);
		old.setPname(newdata.getAname());
		old.setPname(newdata.getPname());
		old.setPrice(newdata.getPrice());
		repo.save(old);
		System.out.println("data updated scussefully...");
	
	
//}
	}
}
