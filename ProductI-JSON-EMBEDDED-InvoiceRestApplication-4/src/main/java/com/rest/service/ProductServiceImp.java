package com.rest.service;

import com.rest.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Product;
import com.rest.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product saveRecord(Product product) {

        double dis = 0.0;
        double gst = 0.0;
        double finalprice;

        double price = product.getPrice();

        if (product.getPcategory().equals(product.getcharges().getCategory())) {
            dis = price * product.getcharges().getDiscount();
            gst = price * product.getcharges().getGst();
        }
        
      
        finalprice = product.getPrice() + gst - dis;
        
       
        
        product.setFinalprice(finalprice);
        Product p = productRepo.save(product);

        return p;
    }

    @Override
    public Product getOneRecord(int pid) {
       Product product=productRepo.findById(pid).get();
    	
    	return product;
    }

    @Override
    public List<Product> getAllRecords() {
     List<Product>products=productRepo.findAll();
        return products;
    }

    @Override
    public Product updateRecord(Product product, int pid) {
     Product oldRecord=productRepo.findById(pid).get();
     
     oldRecord.setPname(product.getPname());
     oldRecord.setPrice(product.getPrice());
     oldRecord.setPtype(product.getPtype());
     oldRecord.setPcategory(product.getPcategory());
     oldRecord.setCharges(product.getcharges());
		
     
     
     double dis = 0.0;
     double gst = 0.0;
     double finalprice;

     double price = product.getPrice();

     if (product.getPcategory().equals(product.getcharges().getCategory())) {
         dis = price * product.getcharges().getDiscount();
         gst = price * product.getcharges().getGst();
     }
     
   
     finalprice = product.getPrice() + gst - dis;
     
     oldRecord.setFinalprice(finalprice);
     
     Product p=productRepo.save(oldRecord);
  
    	return p;
    }

    @Override
    public void deleteRecord(int pid) {
     productRepo.deleteById(pid);
    	
    }
}
