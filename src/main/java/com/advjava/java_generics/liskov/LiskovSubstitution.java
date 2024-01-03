package com.advjava.java_generics.liskov;

import java.util.Arrays;
import com.advjava.java_generics.liskov.clothing_store.ClothingSite;
import com.advjava.java_generics.liskov.clothing_store.clothes.JacketItem;
import com.advjava.java_generics.liskov.clothing_store.clothes.ShirtItem;

public class LiskovSubstitution {

    public static void main(String[] args) {
        ClothingSite.checkoutItems(Arrays.asList(
                new JacketItem(),
                new ShirtItem()));
    }
}
