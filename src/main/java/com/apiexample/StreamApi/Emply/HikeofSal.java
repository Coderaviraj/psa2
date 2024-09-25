package com.apiexample.StreamApi.Emply;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HikeofSal {
    public static void main(String[] args) {
        List<Em> data = Arrays.asList(new Em(1, 5000, "ravi"),
                new Em(2, 6000, "mike"),
                new Em(3, 4000, "stallin"),
                new Em(4, 8000, "thyson"));

        List<Integer> collect = data.stream().map(e->e.getSalary()+(e.getSalary()*10/100)).collect(Collectors.toList());

        System.out.println(collect);

        }
    }
