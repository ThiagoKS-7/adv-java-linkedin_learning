package com.advjava.java_generics.wildcards;

import java.util.Arrays;

import com.advjava.java_generics.wildcards.clothing_store.ClothingSite;
import com.advjava.java_generics.wildcards.clothing_store.clothes.ShirtItem;

public class GenericWildCards {
    public static void main(String[] args) {
        ClothingSite.checkoutItems(Arrays.asList(
                new ShirtItem(),
                new ShirtItem()));
    }
}
