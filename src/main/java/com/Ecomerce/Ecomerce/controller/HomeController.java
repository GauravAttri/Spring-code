package com.Ecomerce.Ecomerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ecomerce.Ecomerce.model.Product;
import com.Ecomerce.Ecomerce.service.Productservice;

@RestController
public class HomeController {
	
	@Autowired
	private Productservice prodserv;

	//Home page Page
	@GetMapping("/")
	public String homePage() {
		return "Home Page";
		
	}
	
	
	@PostMapping("/save")
	public Product addProduct(@RequestBody Product prod) {
		return prodserv.addProd(prod);
	}
	
	@PostMapping("/saveallproduct")
	public List<Product> addProducts(@RequestBody List<Product> prods){
		
		return prodserv.addProds(prods);
	}
	
	@GetMapping("/get")
	public List<Product> getProduct(){
		return prodserv.getProd();
		
	}
	
	@GetMapping("/getbyId/{pId}")
	public Product getProductByID(@PathVariable Long pId) {
	
		return prodserv.getProdbyid(pId);		
	}
	
	@GetMapping("/getbyName/{pName}")
	public List<Product> getProductByNAME(@PathVariable String pName) {
		System.out.println("hello!!!!!!!!");
		return prodserv.getProdbyName(pName);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product prod) {
		return prodserv.updateProd(prod);
	}
	
	@DeleteMapping("/delete/{pId}")
	public String deleteProduct(@PathVariable Long pId) {
		return prodserv.deleteProd(pId);
	}
	
	

}