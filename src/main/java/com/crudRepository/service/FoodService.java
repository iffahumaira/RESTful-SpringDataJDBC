package com.crudRepository.service;

import com.crudRepository.model.Food;

import java.util.List;

public interface FoodService {

    Food addMEnu(Food food);
    Food updateMenu(Food food);
    void deleteById(Integer id);

    List<Food> findAll();
    Food findById(Integer id);
}
