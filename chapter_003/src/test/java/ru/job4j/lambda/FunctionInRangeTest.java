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

    @Test
    public void whenSquaredFunctionFromFiveToEight() {
        FunctionInRange calculation = new FunctionInRange();
        List<Double> result = calculation.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogFromFiveToEight() {
        FunctionInRange calculation = new FunctionInRange();
        List<Double> result = calculation.diapason(5, 8, Math::log);
        List<Double> expected = Arrays.asList(1.6094379124341003D, 1.791759469228055D, 1.9459101490553132D);
        assertThat(result, is(expected));
    }
}