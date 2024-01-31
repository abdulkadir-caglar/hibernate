package com.example.demo.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dals.IProductDal;
import com.example.demo.entities.Product;

@Service
public class ProductService {
	IProductDal productDal;
	
	public ProductService(IProductDal productDal) {
		this.productDal = productDal;
	}
	
	public Product insert(Product entity) {
		var result = productDal.save(entity);
		
		return result;
	}
	
	public Product update(Product entity) {
		var result = productDal.save(entity);
		
		return result;
	}
	
	public List<Product> getAll(){
		var result = (List<Product>)productDal.findAll();
		
		return result;
	}
	
	public Product getById(Long id) {
		var result = productDal.findById(id).get();
		
		return result;
	}
	
	public void delete(Product entity) {
		productDal.delete(entity);
	}
	
	public List<Product> getByCategoryId(Long id){
		var result = productDal.findByCategoryId(id);
		
		return result;
	}
}
