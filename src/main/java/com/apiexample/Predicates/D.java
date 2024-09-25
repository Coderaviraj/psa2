package com.apiexample.Predicates;

import java.util.function.Predicate;

public class D {
    public static void main(String[] args) {
        Predicate<String> val= i->i.startsWith("R");
        boolean result = val.test("Ram");
        System.out.println(result); // false
    }
}
