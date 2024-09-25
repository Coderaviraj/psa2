package com.apiexample.Predicates;

import java.util.function.Predicate;

public class C {
    public static void main(String[] args) {
        Predicate<String> val= i->i.equals("mike");
        boolean result = val.test("Ram");
        System.out.println(result); // false
        
    }
}
