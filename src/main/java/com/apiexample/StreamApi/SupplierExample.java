package com.apiexample.StreamApi;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> val = ()->new Random().nextInt(100);
        System.out.println(val.get());
    }
}
