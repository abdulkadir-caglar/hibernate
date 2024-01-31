package com.example.demo.dals;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Category;

@Repository
public interface ICategoryDal extends CrudRepository<Category, Long>{

}
