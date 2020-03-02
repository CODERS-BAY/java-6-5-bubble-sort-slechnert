package com.codersbay;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {45, 328, 13, 1, 886, 4, 23, 753523521};

        int[] sortedNumbers = bubbleSort(numbers);
        System.out.println(Arrays.toString(sortedNumbers));

    }

    public static int[] bubbleSort(int[] numbers) {
        int lengthUnsorted = numbers.length;
        for (int i = 0; i < lengthUnsorted; i++) {
            for (int j = 1; j < lengthUnsorted && j >= 0; j++) {
                if (numbers[j] > numbers[j - 1]) {
                    continue;
                } else {
                    int tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        return numbers;
    }


}