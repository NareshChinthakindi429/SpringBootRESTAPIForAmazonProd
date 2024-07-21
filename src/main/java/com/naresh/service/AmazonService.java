package com.naresh.service;

import java.util.List;

import com.naresh.model.Amazon_table;

public interface AmazonService {
	public Amazon_table saveproduct(Amazon_table amazon);
	public Amazon_table updateproduct(Amazon_table amazon ,int cid);
	public Amazon_table getoneprodut(int cid);
	public void deleteproduct(int cid);
	public List<Amazon_table> getAllproducts();

}
