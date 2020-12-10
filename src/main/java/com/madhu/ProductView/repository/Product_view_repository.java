package com.madhu.ProductView.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhu.ProductView.model.Product_view;



public interface Product_view_repository extends JpaRepository<Product_view, Integer> {
	Optional<Product_view> findByName(String name);

	}