package com.apiexample.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterArrayContain {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Ajay", "mike", "Ravi", "Tanya", "Ronni", "Kishore", "Michal");
        List<String> newdata = data.stream().filter(x ->x.toLowerCase().contains("a")).collect(Collectors.toList());
        System.out.println("Name having A =" +newdata);
    }
}
