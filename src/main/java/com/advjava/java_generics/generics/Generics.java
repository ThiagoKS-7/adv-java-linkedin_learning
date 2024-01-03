package com.advjava.java_generics.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics example
 *
 */
public class Generics {
    public static void main(String[] args) {
        // Com generics
        List<String> formas = new ArrayList<>();

        formas.add("Circle");
        formas.add("Square");

        String circulo = formas.get(0);
        String quadrado = formas.get(1);

        System.out.println("Com generics: ");
        System.out.println(circulo);
        System.out.println(quadrado);
        System.out.println("\nSem generics: ");

        // Sem generics - permitiria variaveis de qualquer tipo
        List formasSemGenerics = new ArrayList();
        formasSemGenerics.add("Teste");
        formasSemGenerics.add("Retangulo");
        Integer retangulo = (Integer) formasSemGenerics.get(1);
        // não compila, retorna erro por conta do tipo

        System.out.println(retangulo);

    }
}
