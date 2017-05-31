package com.triador.main;

import com.triador.algorithms.MergeSort;

/**
 * Created by antonandreev on 18/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] a = MergeSort.sort(new int[]{8, 2, 11, 3, 22, 100, 2, 10, 123, 45, 1, 1, 4, 20, 10, 11, 4, 9});
        for (int temp : a) {
            System.out.print(temp + " ");
        }
    }
}
