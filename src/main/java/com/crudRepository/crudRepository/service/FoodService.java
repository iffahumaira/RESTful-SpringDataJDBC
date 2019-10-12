package com.crudRepository.crudRepository.service;

import com.crudRepository.crudRepository.model.Food;

import java.util.List;
import java.util.Optional;

public interface FoodService {

    Food addMEnu(Food food);
    Food updateMenu(Food food);
    void deleteById(Food food);

    List<Food> findAll();
    Optional<Food> findById(Food food);
}
