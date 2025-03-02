package com.nursalim.standard.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 1000;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();

        String numberString = "1000";

        Integer intNumber = Integer.valueOf(numberString);
        System.out.println(intNumber);
    }
}
