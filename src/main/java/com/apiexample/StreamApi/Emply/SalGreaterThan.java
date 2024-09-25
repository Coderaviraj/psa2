package com.apiexample.StreamApi.Emply;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalGreaterThan {
    public static void main(String[] args) {
        List<Em> data = Arrays.asList(new Em(1, 5000, "ravi"),
                new Em(2, 6000, "mike"),
                new Em(3, 4000, "stallin"),
                new Em(4, 8000, "thyson"));

        List<Em> collect = data.stream().filter(e -> e.getSalary() > 5000).collect(Collectors.toList());

        for (Em e : collect) {
            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getSalary());

        }
    }
}
