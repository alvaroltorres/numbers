package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {

    @Test
    public void filter(){
        GenericListFilter filter = Mockito.mock(GenericListFilter.class);
        Mockito.when(filter.accept(1)).thenReturn(true);
        Mockito.when(filter.accept(2)).thenReturn(true);
        Mockito.when(filter.accept(3)).thenReturn(true);
        Mockito.when(filter.accept(4)).thenReturn(false);
        Mockito.when(filter.accept(5)).thenReturn(false);
        Mockito.when(filter.accept(6)).thenReturn(false);
        ListFilterer filterer = new ListFilterer(filter);
        Assertions.assertEquals(Arrays.asList(1, 2, 3), filterer.filter(Arrays.asList(1,2,3,4,5,6)));
    }

}
