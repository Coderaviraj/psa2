package com.apiexample.StreamApi;

import java.util.function.Function;

public class FunctionIntStr {
    public static void main(String[] args) {
        Function<Integer ,String> val = x -> "value :" +x*x;
        String result = val.apply(10);
        System.out.println(result);
    }

}
