package com.example.demo.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dals.ISalesDal;
import com.example.demo.entities.Sales;

@Service
public class SalesService {
	ISalesDal salesDal;
	
	public SalesService(ISalesDal salesDal) {
		this.salesDal = salesDal;
	}
	
	public Sales insert(Sales entity) {
		var result = salesDal.save(entity);
		
		return result;
	}
	
	public Sales update(Sales entity) {
		var result = salesDal.save(entity);
		
		return result;
	}
	
	public void delete(Sales entity) {
		salesDal.delete(entity);
	}
	
	public List<Sales> getAll(){
		var result = (List<Sales>)salesDal.findAll();
		
		return result;
	}
	
	public List<Sales> productBySales(Long id){
		var result = salesDal.findByProductId(id);
		
		return result;
	}
	
	public Sales getById(Long id) {
		var result = salesDal.findById(id).get();
		
		return result;
	}
}
