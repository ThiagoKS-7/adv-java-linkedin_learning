package com.advjava.java_generics.generic_methods;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {
        // permite usar o mesmo método para variaveis com tipos diferentes
        String[] words = { "apple", "banana", "pear" };
        Integer[] numbers = { 1, 5, 7 };

        List<String> wordsList = convertArrayToList(words);
        List<Integer> numberList = convertArrayToList(numbers);

        System.out.println(wordsList);
        System.out.println(numberList);
    }

    private static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
