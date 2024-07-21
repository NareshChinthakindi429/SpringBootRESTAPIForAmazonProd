package com.naresh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Amazon_table {

	@Id
	private int cid;
	private String name;
	private long mobile_number;
	private String product_name;
	private double price;
	private int quantity;
	private int total;
	private double discount;
	private double gst_amount;
	private double invoice_bill;
	public Amazon_table() {
		super();
	}
	public Amazon_table(int cid, String name, long mobile_number, String product_name, double price, int quantity,
			int total, double discount, double gst_amount, double invoice_bill) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobile_number = mobile_number;
		this.product_name = product_name;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.discount = discount;
		this.gst_amount = gst_amount;
		this.invoice_bill = invoice_bill;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst_amount() {
		return gst_amount;
	}
	public void setGst_amount(double gst_amount) {
		this.gst_amount = gst_amount;
	}
	public double getInvoice_bill() {
		return invoice_bill;
	}
	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}
	@Override
	public String toString() {
		return "Amazon_table [cid=" + cid + ", name=" + name + ", mobile_number=" + mobile_number + ", product_name="
				+ product_name + ", price=" + price + ", quantity=" + quantity + ", total=" + total + ", discount="
				+ discount + ", gst_amount=" + gst_amount + ", invoice_bill=" + invoice_bill + "]";
	}
	

}
