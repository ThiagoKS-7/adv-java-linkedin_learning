package com.advjava.java_generics.bounded_generics;

import java.util.Arrays;
import java.util.List;

public class BoundedGenerics {
    public static void main(String[] args) {
        // permite usar o mesmo método para variaveis com tipos diferentes
        Double[] doubles = { 2.0, 3.5, 14.7 };
        Integer[] numbers = { 1, 5, 7 };

        List<Double> wordsList = convertArrayToList(doubles);
        List<Integer> numberList = convertArrayToList(numbers);

        System.out.println(wordsList);
        System.out.println(numberList);
    }

    private static <T extends Number> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
