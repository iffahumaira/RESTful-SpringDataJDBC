package com.crudRepository.service;

import com.crudRepository.model.Food;
import com.crudRepository.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService{

    @Autowired
    FoodRepository foodRepository;

    @Override
    public Food addMEnu(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food updateMenu(Food food) {

        Food f = foodRepository.findById(food.getId()).get();
        f.setMenu(food.getMenu());
        f.setDescription(food.getDescription());
        f.setQuantity(food.getQuantity());
        f.setPrice(food.getPrice());

        return foodRepository.save(f);
    }

    @Override
    public void deleteById(Integer id) {
        foodRepository.deleteById(id);
    }

    @Override
    public List<Food> findAll() {
        return (List<Food>) foodRepository.findAll();
    }

    @Override
    public Food findById(Integer id) {
        return foodRepository.findById(id).get();
    }
}
