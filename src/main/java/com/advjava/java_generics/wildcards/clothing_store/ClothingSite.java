package com.advjava.java_generics.wildcards.clothing_store;

import java.util.List;

import com.advjava.java_generics.wildcards.clothing_store.clothes.ClothingItem;

public class ClothingSite {

    public static void checkoutItems(List<? extends ClothingItem> clothes) {
        for (ClothingItem item : clothes) {
            checkoutItem(item);
        }
    }

    private static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }
}
