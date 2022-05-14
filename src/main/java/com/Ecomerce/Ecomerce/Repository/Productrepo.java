package com.Ecomerce.Ecomerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Ecomerce.Ecomerce.model.Product;

@Repository
public interface Productrepo extends JpaRepository<Product, Long>{

	public List<Product> findBypName(String pName);
}
 