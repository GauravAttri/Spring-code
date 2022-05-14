package com.Ecomerce.Ecomerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pId;
	private String pName;
	private Long pCost;
	private String Description;
	private String Country;
	private int Quantity;
	
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Long getpCost() {
		return pCost;
	}
	public void setpCost(Long pCost) {
		this.pCost = pCost;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
	public Product(Long pId, String pName, Long pCost, String description, String country, int quantity) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
		Description = description;
		Country = country;
		Quantity = quantity;
	}
		public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
