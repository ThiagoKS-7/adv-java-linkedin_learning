package com.advjava.java_generics.liskov.clothing_store;

import com.advjava.java_generics.liskov.clothing_store.clothes.ClothingItem;

public class ClothingSite {
    public static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }
}
