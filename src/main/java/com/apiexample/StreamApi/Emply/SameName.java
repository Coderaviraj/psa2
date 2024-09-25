package com.apiexample.StreamApi.Emply;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SameName {
    public static void main(String[] args) {
        List<Em> data = Arrays.asList(new Em (1,5000,"ravi"),
                new Em (2,6000,"mike"),
                new Em (3,7000,"stallin"),
                new Em (4,8000,"ravi"));

        List<Em> collect = data.stream().filter(e->e.getName().equalsIgnoreCase("ravi")).collect(Collectors.toList());

        for (Em emply : collect) {
            System.out.println(emply.getId());
            System.out.println(emply.getName());
            System.out.println(emply.getSalary());

        }
    }

}

