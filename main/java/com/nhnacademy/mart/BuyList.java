package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {

    private final ArrayList <Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    // TODO add 메서드 생성
    public void add(Item item){
       // int add = mount * price;
       // return items.amount;
        items.add(item);
    }

    public static class Item {

        private final String name;
        private final int amount;

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

    }
}
