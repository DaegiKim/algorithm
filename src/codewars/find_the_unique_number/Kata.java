package codewars.find_the_unique_number;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Kata {
    public static double findUniq(double arr[]) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .findAny().get().getKey();
    }

    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}
