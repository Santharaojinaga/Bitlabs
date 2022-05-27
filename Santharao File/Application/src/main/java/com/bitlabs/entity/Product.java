package com.bitlabs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product 
{   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int product_id;
	String product_name;
	double product_price;
    double product_qty;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public double getProduct_qty() {
		return product_qty;
	}
	public void setProduct_qty(double product_qty) {
		this.product_qty = product_qty;
	}
}
