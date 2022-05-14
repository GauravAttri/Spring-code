package com.Ecomerce.Ecomerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecomerce.Ecomerce.Repository.Productrepo;
import com.Ecomerce.Ecomerce.model.Product;

@Service
public class Productservice {

	@Autowired
	private Productrepo prodrepo;
	
	public Product addProd(Product prod) {
		return prodrepo.save(prod);	
	}
	
	public List<Product> addProds(List<Product> prods){
		return prodrepo.saveAll(prods);
	}
	
	
	public List<Product> getProd(){
		return prodrepo.findAll();
		
	}
	
	public Product getProdbyid(Long pId) {
		return prodrepo.findById(pId).orElse(null);
		
	}
	
	public List<Product> getProdbyName(String pName) {
		return prodrepo.findBypName(pName);
		
	}
	
	public String deleteProd(Long pId) {
		prodrepo.deleteById(pId);
		return "Product Delete!!"+pId;
	}
	
	public Product updateProd(Product prod) {
		Product existingProduct= prodrepo.findById(prod.getpId()).orElse(null);
		existingProduct.setpName(prod.getpName());
		existingProduct.setpCost(prod.getpCost());
		existingProduct.setDescription(prod.getDescription());
		return prodrepo.save(existingProduct);
		
	}
}