package com.crudRepository.crudRepository.repository;

import com.crudRepository.crudRepository.model.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food, Integer> {
}
