package com.apiexample.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionStreamSortInt {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,24,5,6,1,3);
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}
