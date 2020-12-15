package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInRange {

    public List<Double> diapason(int start, int finish, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int index = start; index != finish; index++) {
            result.add(
                    func.apply((double) index)
            );
        }
        return result;
    }
}
