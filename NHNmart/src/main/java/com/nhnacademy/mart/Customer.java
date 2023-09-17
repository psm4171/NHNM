package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;
    private Food food;

    private int price;

    private int usablePrice = 20000;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }
    private final ArrayList<Food> foods = new ArrayList<>();

    public ArrayList<Food> getFoods() {
        return foods;
    }

    // TODO pickFoods 메서드 구현

    // 장바구니에 구매할 물품을 넣는 메소드
    public void pickFoods(FoodStand foodStand){

        for(BuyList.Item items : buyList.getItems()){
            for(int i=0; i< items.getAmount(); i++){
                basket.add(foodStand.delete(items.getName())); //foodStand에서 아이템의 이름을 삭제하고 장바구니에 등록
            }
        }
    }

    // 물품 구매한 지불 금액
    public void payTox(Counter counter){

        int totalPrice = counter.pay(basket);

        System.out.println("총 가격은 " + totalPrice +"원 입니다.");

        int changes = usablePrice - totalPrice;
        System.out.println("고객님의 결제 후 잔액은 : " + changes +"원 입니다.");

            if (usablePrice > 20000) {
                log.warn("소지금이 20000원 이상!");
                throw new IllegalArgumentException("소지금은 2만원을 초과하지 않습니다.");

            if (totalPrice > usablePrice){
                log.warn("총 합 가격이 소지금 보다 많습니다.");
                throw new IllegalArgumentException("총 합 가격이 소지금보다 많습니다.");
            }
        }
    }


//    public void pickFoods(FoodStand foodStand) {
//
//        int price = 0;
//        for (int i = 0; i < buyList.getItems().size(); i++) {
//            for (int j = 0; j < foodStand.getFoods().size(); j++) { // 가격 foodStand
//                if (foodStand.getFoods().equals( (buyList.getItems()) )) {
//                  price = buyList.getItems(amount) * price;
//                  //  price = basket.getFoods().get(i).getPrice();
//                }
//
//                System.out.println("PRICE" + price);
//            }
//            break;
//
//        }
//       // basket.add(food).BuyList.getItems();
//    }

}



// pay(Basket basket)

    // TODO payTox 메서드 구현
//    public void payTox(BuyList buyList){
//        Customer.buyList[]
//    }

//public void payTox(Counter counter) {
//        int payPrice = counter.pay(basket);
//        if(BuyableMoney < payPrice){
//        throw new IllegalArgumentException("구매 항목이 소지한 금액을 초과 하였습니다.");
//        }
//        System.out.println("총 가격은 " + payPrice + "원 입니다.");
//        BuyableMoney -= payPrice;
//
//        System.out.println("고객님 결제 후 잔액 : " + BuyableMoney + "원");
//        }