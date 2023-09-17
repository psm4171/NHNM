package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();


        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer seungMin = new Customer(buyList);

        // 장바구니를 챙긴다.
        seungMin.bring(mart.provideBasket());

        // 식품을 담는다.
        seungMin.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        // seungMin.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기

        log.info("NHN 마트에 입장합니다.");
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.");

        Scanner sc = new Scanner(System.in);

        BuyList buyList = new BuyList();

        log.info("상품 입력하세요.");

        String name = sc.nextLine();
        String [] d = name.split(" ");

        for(int i=0; i<d.length; i+=2){

            int amount =  Integer.parseInt(name);
            BuyList.Item item = new BuyList.Item(name, amount);

            if(amount < 1) {
                log.warn("오류 발생, 상품을 1개 이상 담아야 합니다!");
                throw new IllegalArgumentException("상품을 1개 이상 담아야 합니다.");
            }
            if(name.isEmpty()){
                log.warn("사고 싶은 물건을 고르세요.");
                throw new IllegalArgumentException("사고 싶은 물건을 고르세요. ");
            }

            buyList.add(item);
        }

         return buyList;


    }


}

//        String name[] = new String[4];
//        int amount[] = new int[4];

//        for (int i = 1; i <= name.length; i++) {
//            name[i] = sc.next();
//            amount[i] = sc.nextInt();
//
//        }
//  items = new BuyList.Item(name[i], amount[i]);