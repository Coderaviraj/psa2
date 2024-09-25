package com.apiexample.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterArrayString {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mike","roop","manav","shyam","moona");

        List<String> newdata =
                data.stream().filter(x -> x.startsWith("m")).
                        collect(Collectors.toList());

        System.out.println("Filtered Array =" + newdata);

    }
}
