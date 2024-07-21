package com.naresh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.model.Amazon_table;
import com.naresh.repo.AmazonRepo;
@Service
public class AmazonServiceImplementation implements AmazonService {

	@Autowired
	public AmazonRepo repo;
	
	@Override
	public Amazon_table saveproduct(Amazon_table amazon) {
		double gst=100;
		double dis=0.0;
		double tot=amazon.getPrice()+amazon.getQuantity();
		if(tot<30000) {
			dis=tot/100*5;
		
		}
		else if (tot>=30000&&tot<=5000) {
			dis=tot/100*10;
			
		}
		
		else {
			dis=tot/100*15;
		}
		
		double invoice=tot+dis+gst;
		
		amazon.setGst_amount(gst);
		amazon.setDiscount(dis);
		amazon.setInvoice_bill(invoice);
		amazon.setTotal((int) tot);
		Amazon_table saves=repo.save(amazon);
		return saves;		
	}

	@Override
	public Amazon_table updateproduct(Amazon_table amazon, int cid) {
		Amazon_table oldrecord=repo.findById(cid).get();
		double gst=100;
		double dis=0.0;
		double tot=amazon.getPrice()+amazon.getQuantity();
		if(tot<30000) {
			dis=tot/100*5;
		
		}
		else if (tot>=30000&&tot<=5000) {
			dis=tot/100*10;
			
		}
		
		else {
			dis=tot/100*15;
		}
		
		double invoice=tot+dis+gst;
		
		amazon.setGst_amount(gst);
		amazon.setDiscount(dis);
		amazon.setInvoice_bill(invoice);
		amazon.setTotal((int) tot);
		Amazon_table saves=repo.save(amazon);		
		return null;
	}

	@Override
	public Amazon_table getoneprodut(int cid) {
		Amazon_table get=repo.findById(cid).get();
		return get;		
	}

	@Override
	public void deleteproduct(int cid) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Amazon_table> getAllproducts() {
		List<Amazon_table> getall=repo.findAll();
		return getall;		
	}

}
