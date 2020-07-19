package com.itacademy.task.hw5;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6};

        moveArray(a, 1);
        System.out.println(Arrays.toString(a));

    }

    public static void moveArray(int[] array, int positions) {
        int size = array.length;

        for (int i = 0; i < positions; i++) {
            int value = array[size - 1];
            System.arraycopy(array, 0, array, 1, size - 1);
            array[0] = value;
        }
    }
}
