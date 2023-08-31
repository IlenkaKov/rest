package org.example;

import ru.netology.services.restService;

public class Main {
    public static void main(String[] args) {
        restService service = new restService();
        long balance = 30000;
        int count = service.calculate(10_000, 3_000, 20_000);
        System.out.println(count);
    }
}
