package com.apiexample.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionStreamSortIntDuplicate {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,24,5,6,1,3,2,1,3,0);
        List<Integer> collect = list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}
