package com.madhu.ProductView.controller;



import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.ResponseEntity.BodyBuilder;
import com.madhu.ProductView.model.Product_view;

import com.madhu.ProductView.repository.Product_view_repository;

import antlr.StringUtils;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class Product_view_controller {
	@Autowired
	Product_view_repository repository;
	
	
//Getting all data in the product-myc-30 database
	@GetMapping(value="/product_lists")
	public java.util.List<Product_view> getAllProducts(){
		return repository.findAll();
		
	}

//	getting product by its id
	@RequestMapping("/product_lists/{id}")
	public Optional<Product_view> getProductById(@PathVariable("id") int id) {
			
			return repository.findById((int) id);
			
	}
	
	//saving the product data to postgresql
	@PostMapping(value="/product_list",consumes = "application/json", produces = "application/json")
	public Product_view createProduct(@RequestBody Product_view product) {
		System.out.println(product.toString());
		 repository.save(product);
		 return product;
	
	}
	
	@PutMapping(path="/product_lists/{id}",consumes = "application/json", produces = "application/json")
	public Product_view saveOrUpdateEmployee(@RequestBody Product_view product) {
		
		 repository.save(product);
		 return product;
	}
	
	@DeleteMapping("/product_list/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
	System.out.println(id);
		 repository.deleteById((int) id);
			return "Deleted";
	}


}
