package com.itacademy.task.hw5;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] arg = delete(new int[]{1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 6, 6, 7});
        System.out.print(Arrays.toString(arg));

    }

    public static int[] delete(int[] inp) {
        int[] out_arr = new int[inp.length];
        int curr = 0;

        for (int i = 0; i < inp.length; i++) {
            if (i + 1 < inp.length) {
                if (inp[i] == inp[i + 1]) {
                    out_arr[curr] = 0;
                } else {
                    out_arr[curr + 1] = inp[i + 1];
                    curr++;
                }
            }
        }
        return out_arr;
    }
}

