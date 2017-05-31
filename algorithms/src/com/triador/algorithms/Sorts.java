package com.triador.algorithms;

/**
 * Created by antonandreev on 02/05/2017.
 */
public class Sorts {

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

}
