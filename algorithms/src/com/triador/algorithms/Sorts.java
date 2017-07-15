package com.triador.algorithms;

/**
 * Created by antonandreev on 02/05/2017.
 */
public class Sorts {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j >= 0 && array[j + 1] < array[j]; j--) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public static int[] ONSort(int[] array, int n) {
        final int MAX = n;
        int[] aTemp = new int[MAX];
        for (int i = 0; i < array.length; i++)
            aTemp[array[i]]++;
        return aTemp;
    }

}
