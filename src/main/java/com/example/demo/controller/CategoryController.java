package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.CategoryService;
import com.example.demo.entities.Category;

@RequestMapping("/api")
@RestController
public class CategoryController {
	CategoryService categoryService;
	
	CategoryController(CategoryService categoryService){
		this.categoryService = categoryService;
	}
	
	@GetMapping(path = "category/getall")
	public List<Category> getAll(){
		return categoryService.getAll();
	}
}
