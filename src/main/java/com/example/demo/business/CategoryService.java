package com.example.demo.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dals.ICategoryDal;
import com.example.demo.entities.Category;

@Service
public class CategoryService {
	private ICategoryDal categoryDal;
	
	public CategoryService(ICategoryDal categoryDal) {
		this.categoryDal = categoryDal;
	}
	
	public Category insert(Category entity) {
		var result = categoryDal.save(entity);
		
		return result;
	}
	
	public Category update(Category entity) {
		var result = categoryDal.save(entity);
		
		return result;
	}
	
	public List<Category> getAll(){
		var result = (List<Category>)categoryDal.findAll();
		
		return result;
	}
	
	public Category getById(Long id) {
		var result = categoryDal.findById(id).get();
		
		return result;
	}
	
	public void delete(Category entity) {
		categoryDal.delete(entity);
	}
}
