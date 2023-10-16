package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{

    private int divisor;
    @Override
    public boolean accept(Integer number){
        return number % divisor == 0;
    }


}
