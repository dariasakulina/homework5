package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VocationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vocation.csv")
    public void shouldCalculate(int expected, int income, int expenses, int threshold) {
        VocationService service = new VocationService();

        int actual = service.calculate(income,expenses,threshold);
        System.out.println("В следующем году буду отдыхать " + actual + " месяца.");

        Assertions.assertEquals(expected, actual);
    }
}

