package com.madhu.ProductView.model;
import java.security.Timestamp;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.Temporal;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

 
@Entity
@Table(name = "Product_view")
public class Product_view {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private float price;

	@Column(name="description")
	private String description;
	
	@Column(name="discount")
	private int discount;

	@Column(name="category_id")
	private int category_id;
	
	@Column(name="exp_date")
	private Date exp_date;
	
	@Column(name="mfd_date")
	private Date mfd_date;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="start_date")
	private Date start_date;
	
	@Column(name="end_date")
	private Date end_date;
	
	       
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public Date getExp_date() {
		return exp_date;
	}

	public void setExp_date(Date exp_date) {
		this.exp_date = exp_date;
	}

	public Date getMfd_date() {
		return mfd_date;
	}

	public void setMfd_date(Date mfd_date) {
		this.mfd_date = mfd_date;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}


	@Override
	public String toString() {
		return "Product_view [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", discount=" + discount + ", category_id=" + category_id + ", exp_date=" + exp_date + ", mfd_date="
				+ mfd_date + ", brand=" + brand + ", start_date=" + start_date + ", end_date=" + end_date
				+
				 "]";
	}
	
}