package com.example.backendspring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name ="product")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pId;
    private String pName;
    private String pType;
    private String pBrand;
    private int pQty;
    private int pInvPrice;
    private int pSelPrice;
    private String suppliarName;
    private String suppliarAddress;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getpBrand() {
		return pBrand;
	}
	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public int getpInvPrice() {
		return pInvPrice;
	}
	public void setpInvPrice(int pInvPrice) {
		this.pInvPrice = pInvPrice;
	}
	public int getpSelPrice() {
		return pSelPrice;
	}
	public void setpSelPrice(int pSelPrice) {
		this.pSelPrice = pSelPrice;
	}
	public String getSuppliarName() {
		return suppliarName;
	}
	public void setSuppliarName(String suppliarName) {
		this.suppliarName = suppliarName;
	}
	public String getSuppliarAddress() {
		return suppliarAddress;
	}
	public void setSuppliarAddress(String suppliarAddress) {
		this.suppliarAddress = suppliarAddress;
	}
    
    
       
}
