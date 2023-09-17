package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    @DisplayName("total 정확할 경우")
    void totalTest(){
        Basket basket = new Basket();
        basket.add(new Food("양파", 1000));
        basket.add(new Food("계란", 5000));
        basket.add(new Food("파", 500));

        Counter.pay(basket);
        Assertions.assertEquals(6500, Counter.pay(basket));
    }

    @Test
    @DisplayName("전체 가격이 음수인 경우")
    void downpayTest(){
        Basket basket = new Basket();
        basket.add(new Food("계란", -5000));
        Counter.pay(basket);
        Assertions.assertThrows(IllegalArgumentException.class, () -> Counter.pay(basket));
    }

}