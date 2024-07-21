package com.naresh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.model.Amazon_table;
import com.naresh.service.AmazonServiceImplementation;

@RestController
public class AmazonController {
	
	
	@Autowired
	public AmazonServiceImplementation service;

	@PostMapping("/save")
	public String saveproduct(@RequestBody Amazon_table amazon,ModelMap model) {
		Amazon_table saveproduct=service.saveproduct(amazon);
		
             String message=null;
             if(saveproduct!=null) {
            	 message="data save successfully";
             }
             else {
            	 message="data  not saveed";

             }
             
		return message;
	}
	
	@GetMapping("getOne/{cid}")
	public Amazon_table getoneproudct(@PathVariable int cid) {
		
		Amazon_table getone=service.getoneprodut(cid);
		return getone;
	}
	@GetMapping("/getAll")
	public List<Amazon_table> getallproducts(){
		List<Amazon_table> getall=service.getAllproducts();
		return getall;
	}
	
	
	@PutMapping("/update/{cid}")
	public Amazon_table updateptoduct(@RequestBody Amazon_table amazon, @PathVariable int cid) {
		Amazon_table amz=service.updateproduct(amazon, cid);
		return amz;
	}
}
