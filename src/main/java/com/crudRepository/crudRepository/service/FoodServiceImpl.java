package com.crudRepository.crudRepository.service;

import com.crudRepository.crudRepository.model.Food;
import com.crudRepository.crudRepository.repository.FoodRepository;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
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

        //im trying to loop over food and find null value in field. If it is null, so it will take the existing
        //value for that field.

//        for (Food foodList : f.getClass()) {
//            if (foodList == null || foodList.isEmpty()) {
//                return false;
//            }
//        }
//        return true;

        log.info(" [ UPDATE MENU ] ");
        log.info(f.toString());

        return foodRepository.save(f);
    }

    @Override
    public void deleteById(Food food) {
        foodRepository.deleteById(food.getId());
    }

    @Override
    public List<Food> findAll() {

        var fl = foodRepository.findAll();

        var foodList = new ArrayList<Food>();
        fl.forEach(e -> foodList.add(e));

        return foodList;
    }

    @Override
    public Optional<Food> findById(Food food) {
        return foodRepository.findById(food.getId());
    }
}
