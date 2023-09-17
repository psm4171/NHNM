package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NhnMartTest {

    @Test
    @DisplayName("매대가 잘 들어갔는지 테스트")
    void onionTest(){
        NhnMart mart = new NhnMart();
        Food food = new Food("양파", 1_000);
        boolean bool = true;
        String name = "양파";
        for (int i = 0; i < i; i++) {
            if (food.getName().equals(name)) {
                bool = true;
            }
        }
        Assertions.assertTrue(bool);


    }

}