package com.advjava.java_generics.liskov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.advjava.java_generics.liskov.clothing_store.ClothingSite;
import com.advjava.java_generics.liskov.clothing_store.clothes.ClothingItem;
import com.advjava.java_generics.liskov.clothing_store.clothes.JacketItem;
import com.advjava.java_generics.liskov.clothing_store.clothes.ShirtItem;

public class LiskovSubstitution {

    private static List<ClothingItem> clothes = Arrays.asList(
            new JacketItem(),
            new ShirtItem());

    public static void main(String[] args) {

        for (ClothingItem item : clothes) {
            ClothingSite.checkoutItem(item);
        }
    }
}
