package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixConverter {

    public static void main(String[] args) {
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(convert(matrix));
    }

    public static List<Integer> convert(Integer[][] matrix) {

        return Stream.of(matrix).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
