package com.apiexample.Predicates;

import java.util.function.Predicate;

public class A {
    public static void main(String[] args) {
       Predicate<Integer> val = i->i%2==0;
        boolean result = val.test(10);
        if (result) {
            System.out.println("Even");
        }
        else {
            System.out.println("Not Even");
        }
    }
}
