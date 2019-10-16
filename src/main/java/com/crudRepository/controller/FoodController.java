package com.crudRepository.controller;

import com.crudRepository.model.Food;
import com.crudRepository.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/")
public class FoodController {

    FoodService foodService;
    //Constructor injection
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

        @GetMapping("food")
        public List<Food> findAll (){
            return foodService.findAll();
        }

    @GetMapping("food/{id}")
    public Food findById (@PathVariable("id") Integer id){
        return foodService.findById(id);
    }

    @PutMapping("food")
    @ResponseBody
    public Food updateById (@RequestBody Food food){
        Food updateFood = foodService.updateMenu(food);
        return updateFood;
    }

    @DeleteMapping("food/{id}")
    @ResponseBody
    public void deleteById(@PathVariable("id") Integer id){
         foodService.deleteById(id);
    }

    @PostMapping("food")
    @ResponseBody
    public Food addMenu(@RequestBody Food food){
        return foodService.addMEnu(food);
    }
}
