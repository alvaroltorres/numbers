package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {

    @Test
    void accept(){
        PositiveFilter filter = new PositiveFilter();
        List<Integer> positives = Arrays.asList(1, 2, 10, 22, 100, 1000, Integer.MAX_VALUE);
        List<Integer> negatives = Arrays.asList(0, -1, -2, -3, -22, -100, -1111, Integer.MIN_VALUE);
        for (int n : positives)
            Assertions.assertTrue(filter.accept(n));
        for (int n : negatives)
            Assertions.assertFalse(filter.accept(n));
    }
}
