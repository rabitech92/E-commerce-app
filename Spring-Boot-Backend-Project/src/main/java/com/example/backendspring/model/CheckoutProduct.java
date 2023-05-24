package com.example.backendspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name ="checkout")
public class CheckoutProduct {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private int id; 
	private  int productQuntity;
	private Product product;
	
	
	public int getId() {
		return this.id;
	}
	public int getProductQuntity() {
		return this.productQuntity;
	}
	public Product getProduct() {
		return this.product;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProductQuntity(int productQuntity) {
		this.productQuntity = productQuntity;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	

}
