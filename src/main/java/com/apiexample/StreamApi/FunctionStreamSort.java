package com.apiexample.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionStreamSort {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("mike", "ravi", "tanya", "ajay");
        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}
