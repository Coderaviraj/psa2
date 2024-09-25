package com.apiexample.Predicates;

import java.util.function.Predicate;

public class E {
    public static void main(String[] args) {
        Predicate<String> val= i->i.length()>=4;
        boolean result = val.test("Ram ji");
        System.out.println(result); // false
    }
}
