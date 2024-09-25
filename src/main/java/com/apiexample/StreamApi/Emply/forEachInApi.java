package com.apiexample.StreamApi.Emply;

import java.util.Arrays;
import java.util.List;

public class forEachInApi {
    // Java 8 forEach method example
    public static void main(String[] args) {
        List<Em> data = Arrays.asList(new Em(1, 5000, "ravi"),
                new Em(2, 4000, "mike"),
                new Em(3, 4000, "stallin"),
                new Em(4, 5000, "thyson"),
                new Em(5, 6000, "chandan"),
                new Em(6, 4000, "sawan"),
                new Em(7, 6000, "aman"),
                new Em(8, 4000, "hrithik"));

        data.stream().forEach(e-> System.out.println(e.getName())); //consumer

    }
}
