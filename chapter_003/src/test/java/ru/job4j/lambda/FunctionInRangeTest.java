package ru.job4j.lambda;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FunctionInRangeTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionInRange functionInRange = new FunctionInRange();
        List<Double> result = functionInRange.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }
}