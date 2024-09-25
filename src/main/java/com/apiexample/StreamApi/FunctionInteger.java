package com.apiexample.StreamApi;

import java.util.function.Function;

public class FunctionInteger {
    public static void main(String[] args) {
        Function<Integer,Integer> val = x->x*2;
        Integer apply = val.apply(10);
        System.out.println(apply);
    }
}
