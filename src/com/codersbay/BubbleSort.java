package com.codersbay;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {234, 58, 3, 1, 16, 44, 32, 111};

        int tmp = Integer.MIN_VALUE;
        int lengthUnsorted = numbers.length;
        int currentMax = 0;

        for (int i = 0; i < lengthUnsorted; i++) {
            for (int j = 1; j < lengthUnsorted; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
