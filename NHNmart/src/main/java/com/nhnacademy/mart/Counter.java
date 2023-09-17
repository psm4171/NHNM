package com.nhnacademy.mart;

public class Counter {

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)

    public static int pay(Basket basket){

        int tot = 0;

        for(Food food : basket.getFoods()){
            tot += food.getPrice();
        }

        if(tot<0){
            throw new IllegalArgumentException("금액은 0보다 낮을 수 없습니다.");
        }
        return tot;

    }

}
