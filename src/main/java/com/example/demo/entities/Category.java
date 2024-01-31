package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "category")
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Category {
	private Long id;
	private String name;
}
