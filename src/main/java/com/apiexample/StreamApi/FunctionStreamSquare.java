package com.apiexample.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionStreamSquare {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Integer> collected = data.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(collected);

    }
}
