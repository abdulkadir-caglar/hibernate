package com.example.demo.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "sales")
@NoArgsConstructor @AllArgsConstructor

@Entity
public class Sales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sales_id")
	private Long id;
	@Column(name = "piece")
	private int piece;
	@Column(name = "product_id")
	private Product product;
	@Column(name = "date")
	private Date date;
}
