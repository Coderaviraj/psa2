package com.apiexample.StreamApi;

import java.util.function.Consumer;

public class ConsumerInt {
    public static void main(String[] args) {
        Consumer<Integer> val = x-> System.out.println(x);
        val.accept(10);
    }
}
