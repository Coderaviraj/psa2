package com.apiexample.Predicates;

import java.util.function.Predicate;

public class B {
    public static void main(String[] args) {
        Predicate<Integer> val = x->x>3;
        boolean test = val.test(10);
        System.out.println(test);
    }
}
