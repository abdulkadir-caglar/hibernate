package com.example.demo.dals;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Sales;

@Repository
public interface ISalesDal extends CrudRepository<Sales, Long>{
	
	List<Sales> findByProductId(Long id);
}
