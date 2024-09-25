package com.apiexample.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionStreamCont {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("mike", "ravi", "tanya", "shyam");
        List<String> collect = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
