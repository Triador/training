package com.triador.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by antonandreev on 18/03/2017.
 */
public class Main {

    final static int MAX = 2 * 1000 * 1000 * 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * MAX);
        }
        int [] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        int [] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        int [] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = a[i];
        }
        int [] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = a[i];
        }

        long startTime = System.currentTimeMillis();
        insertionSort(d);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("InsertionSort " + totalTime + "ms");

        startTime = System.currentTimeMillis();
        bubbleSort(a);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("BubbleSortWhile " + totalTime + "ms");

        startTime = System.currentTimeMillis();
        bubbleSortFor(b);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("BubbleSortFor " + totalTime + "ms");

        startTime = System.currentTimeMillis();
        selectionSort(c);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("SelectionSort " + totalTime + "ms");

        startTime = System.currentTimeMillis();
        sort(e);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("MergeSort " + totalTime + "ms");
    }

    public static int[] bubbleSort(int[] a) {
        boolean swapped = true;
        int j = 0;
        int length = a.length;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < length - j; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        return a;
    }

    public static int[] bubbleSortFor(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i ++) {
            for (int j = i; j < length; j ++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }

    public static int[] selectionSort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = tmp;
            }
        }
        return a;
    }

    public static int[] insertionSort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
        return a;
    }

    private static int[] aux;

    private static void merge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        for (int k = low; k <= high; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > high) a[k] = aux[i++];
            else if (aux[j] < aux[i]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    private static void sort(int[] a, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    public static int[] sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length - 1);
        return a;
    }
}
