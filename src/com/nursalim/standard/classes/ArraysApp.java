package com.nursalim.standard.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {100, 30, 25, 10, 15, 45};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 25));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));
    }
}
