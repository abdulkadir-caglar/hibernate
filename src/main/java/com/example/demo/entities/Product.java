package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "product")
@NoArgsConstructor @AllArgsConstructor

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Long id;
	@Column(name = "product_name")
	private String name;
	@Column(name = "price")
	private float price;
	
	@ManyToOne
	@Column(name = "category_id")
	private Category category;
	@Column(name = "description")
	private String description;
}
