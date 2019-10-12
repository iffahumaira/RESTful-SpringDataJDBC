package com.crudRepository.crudRepository.controller;

import com.crudRepository.crudRepository.model.Food;
import com.crudRepository.crudRepository.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/food/")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/findAll")
    @ResponseBody
    public List<Food> findAll (){
        return foodService.findAll();
    }

    @GetMapping("/findById")
    @ResponseBody
    public Optional<Food> findById (@RequestBody Food food){
        return foodService.findById(food);
    }

    @PutMapping("/updateById")
    @ResponseBody
    public Food updateById (@RequestBody Food food){
        Food updateFood = foodService.updateMenu(food);
        return updateFood;
    }

    @DeleteMapping("/deleteById")
    @ResponseBody
    public void deleteById(@RequestBody Food food){
         foodService.deleteById(food);
    }

    @PostMapping("/addMenu")
    @ResponseBody
    public Food addMenu(@RequestBody Food food){
        return foodService.addMEnu(food);
    }
}
