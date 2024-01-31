package com.example.demo.dals;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Product;

@Repository
public interface IProductDal extends CrudRepository<Product, Long> {
	List<Product> findByCategoryId(Long id);

}
