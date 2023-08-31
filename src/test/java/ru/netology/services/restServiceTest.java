package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class restServiceTest {

    @Test
    void month1() {
        restService service = new restService();
        long balance = 0;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month2() {
        restService service = new restService();
        long balance = 7_000;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void month3() {
        restService service = new restService();
        long balance = 14_000;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month4() {
        restService service = new restService();
        long balance = 21_000;
        int income = 0;
        int expenses = (3_000 + 12_000);
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month5() {
        restService service = new restService();
        long balance = 6_000;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month6() {
        restService service = new restService();
        long balance = 13_000;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month7() {
        restService service = new restService();
        long balance = 20_000;
        int income = 0;
        int expenses = (3_000 + 11_334);
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month8() {
        restService service = new restService();
        long balance = 5_666;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month9() {
        restService service = new restService();
        long balance = 12_666;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month10() {
        restService service = new restService();
        long balance = 19_666;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month11() {
        restService service = new restService();
        long balance = 26_666;
        int income = 0;
        int expenses = (3_000 + 15_778);
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month12() {
        restService service = new restService();
        long balance = 7_888;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }
}


