package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    public ArrayList<Food> getFoods() {
        return foods;
    }

    // TODO add 메서드 구현
//    public int add(int price, int amount){
//        this.price = price;
//        this.amount = amount;
//        return price * amount;
//    }

    public void add(Food food){
        foods.add(food);
    }

    // TODO 장바구니에 담은 Food 삭제 구현

    public Food delete(String name){
        int index = -1;
        for(int i = 0; i < foods.size();i++){
            if(foods.get(i).getName().equals(name)){
                index = i;
                break;
            }
        }

        log.warn("재고가 없습니다.");
        throw new IllegalArgumentException("재고가 부족합니다.");

        return foods.get(index);
    }
}
