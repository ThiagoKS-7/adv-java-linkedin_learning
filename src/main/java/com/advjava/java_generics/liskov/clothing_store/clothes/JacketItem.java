package com.advjava.java_generics.liskov.clothing_store.clothes;

public class JacketItem extends ClothingItem {

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public String getName() {
        return "Jacket";
    }

}
