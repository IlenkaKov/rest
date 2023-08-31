package ru.netology.services;

public class restService {
    public int calculate(int income, int expences, int threshold) {
        long balance = 0;
        int count = 0;
        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) {
                count++;
                balance = (balance - expences) / 3;
            } else {
                balance = balance + income - expences;
            }
        }
        return count;
    }
}
