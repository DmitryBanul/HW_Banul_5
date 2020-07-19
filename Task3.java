package com.itacademy.task.hw5;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4};
        int[] array2 = {5, 6, 7,};
        int[] array = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, array, 0, array1.length);
        System.arraycopy(array2, 0, array, array1.length, array2.length);
        System.out.println(Arrays.toString(array));

    }

}

