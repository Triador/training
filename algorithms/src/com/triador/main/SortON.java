package com.triador.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by antonandreev on 04/06/2017.
 */
public class SortON {
    final static int MAX = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] aTemp = new int[MAX];
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * MAX);
        }

        for (int i = 0; i < n; i++)
            aTemp[a[i]]++;

        for (int i = 0; i < n; i++) {
                for (int j = 0; j < aTemp[i]; j++) {
                    System.out.print(i + " ");
                }
        }
    }
}
