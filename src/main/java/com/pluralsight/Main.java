package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float moneyFloat = 0;
        double moneyDouble = 0;
        BigDecimal moneyBigDecimal = BigDecimal.ZERO;

        //add 10 cents each iteration
        for(int i = 1; i <= 10; i++) {
            moneyFloat += 0.10;
            moneyDouble += 0.10;
            moneyBigDecimal = moneyBigDecimal.add(BigDecimal.valueOf(0.10));
        }

        System.out.println("Iteration 1");
        System.out.println("Float: " + moneyFloat);
        System.out.println("Double: " + moneyDouble);
        System.out.println("BigDecimal: " + moneyBigDecimal);

        moneyFloat = 0;
        moneyDouble = 0;
        moneyBigDecimal = BigDecimal.ZERO;

        for(int i = 1; i <= 1000; i++) {
            moneyFloat += 19.99;
            moneyDouble += 19.99;
            moneyBigDecimal = moneyBigDecimal.add(BigDecimal.valueOf(19.99));
        }

        System.out.println("\nIteration 2");
        System.out.println("Float: " + moneyFloat);
        System.out.println("Double: " + moneyDouble);
        System.out.println("BigDecimal: " + moneyBigDecimal);
        System.out.println("Float is off by 18.4 cents");
    }
}