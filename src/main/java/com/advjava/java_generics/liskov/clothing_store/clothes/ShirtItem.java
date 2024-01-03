package com.advjava.java_generics.liskov.clothing_store.clothes;

public class ShirtItem extends ClothingItem {

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getName() {
        return "Shirt";
    }

}
