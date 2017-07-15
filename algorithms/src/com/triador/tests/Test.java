package com.triador.tests;

import com.triador.algorithms.MergeSort;
import com.triador.algorithms.Sorts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by antonandreev on 15/07/2017.
 */
public class Test {
    final static int MAX = 2 * 1000 * 10;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * MAX);
        }

        long startTime = System.currentTimeMillis();
        Sorts.insertionSort(newArray(a, n));
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("InsertionSort " + totalTime + "ms");

        startTime = System.currentTimeMillis();
        Sorts.bubbleSort(newArray(a, n));
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("BubbleSort " + totalTime + "ms");

        startTime = System.currentTimeMillis();
        Sorts.selectionSort(newArray(a, n));
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("SelectionSort " + totalTime + "ms");

        startTime = System.currentTimeMillis();
        MergeSort.sort(newArray(a, n));
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("MergeSort " + totalTime + "ms");

        startTime = System.currentTimeMillis();
        Sorts.ONSort(newArray(a, n), n);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("ONSort " + totalTime + "ms");
    }

    public static int[] newArray(int[] a, int n) {
        int [] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
