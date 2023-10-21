package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {

    @Test
    void divisibleBy2(){
        DivisibleByFilter filter = new DivisibleByFilter(2);
        List<Integer> divisible = Arrays.asList(0, 2, 4, 8, 10, 22, 222, 4444);
        List<Integer> undivisible = Arrays.asList(1, 3, 5, 9, 11, 33, 233, 44445);
        for (int n : divisible)
            Assertions.assertTrue(filter.accept(n));
        for (int n : undivisible)
            Assertions.assertFalse(filter.accept(n));
    }

    @Test
    void divisibleBy3(){
        DivisibleByFilter filter = new DivisibleByFilter(3);
        List<Integer> divisible = Arrays.asList(0, 3, 6, 9, 12, 33, 333, 9999);
        List<Integer> undivisible = Arrays.asList(1, 2, 4, 5, 11, 44, 100, 1000);
        for (int n : divisible)
            Assertions.assertTrue(filter.accept(n));
        for (int n : undivisible)
            Assertions.assertFalse(filter.accept(n));
    }

    @Test
    void divisibleBy10(){
        DivisibleByFilter filter = new DivisibleByFilter(10);
        List<Integer> divisible = Arrays.asList(0, 10, 20, 30, 40, 50, 100, 1000);
        List<Integer> undivisible = Arrays.asList(1, 2, 4, 5, 11, 44, 233, 1001);
        for (int n : divisible)
            Assertions.assertTrue(filter.accept(n));
        for (int n : undivisible)
            Assertions.assertFalse(filter.accept(n));
    }

}
