package com.nhnacademy.mart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NhnMart {

    private final FoodStand foodStand = new FoodStand();

    public void prepareMart() {
        fillFoodStand();
    }

  //   음식 세팅
    private void fillFoodStand() {

        try {
            for (int i = 0; i < 2; i++) {
                foodStand.add(new Food("양파", 1_000));
            }
            for (int i = 0; i < 5; i++) {
                foodStand.add(new Food("계란", 5_000));
            }
            for (int i = 0; i < 10; i++) {
                foodStand.add(new Food("파", 500));
            }
            for (int i = 0; i < 20; i++) {
                foodStand.add(new Food("사과", 2_000));
            }
        }
        catch (IllegalArgumentException e){
            log.warn("식품 매대에 없는 상품입니다.");
            System.out.println(e.getMessage());
        }
    }

    public Counter getCounter(){
        return new Counter();
    }

    public Basket provideBasket() {
        return new Basket();
    }

    public FoodStand getFoodStand(){
        return foodStand;
    }

    // 식품을 담는 getFoodStand 영역
//    public Food getFoodStand() {
//      return foodStand.getFoodStand();
//    }

}
