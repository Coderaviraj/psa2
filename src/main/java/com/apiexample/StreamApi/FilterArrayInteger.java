package com.apiexample.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterArrayInteger {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10000, 20000, 31000, 40000, 41000, 5000, 6000, 61000, 62000,70000,91,100);

        List<Integer> newdata =
                data.stream().filter(x -> x>=4000).
                        collect(Collectors.toList());

        System.out.println("Filtered Array =" + newdata);

    }
}
