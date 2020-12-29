package ru.job4j.stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamUsage {

    public static void main(String[] args) {
        List<Integer> integerList = new Random()
                .ints(1000, -1000, 1000)
                .boxed()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        integerList.forEach(System.out::println);
    }
}