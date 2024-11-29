package com.chap06.sub01;
import java.util.List;
import java.math.BigDecimal;

public class Calculator{
    double sum(List<BigDecimal> numbers){
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal num : numbers){
            sum = sum.add(num);
        }
        return sum.doubleValue();
    }
}