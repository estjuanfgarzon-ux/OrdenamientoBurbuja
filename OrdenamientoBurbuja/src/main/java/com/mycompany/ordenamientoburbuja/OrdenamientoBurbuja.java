package com.mycompany.ordenamientoburbuja;
import java.util.Arrays;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        int[] arr = {45, 22, 11, -4, 7, 3};

        System.out.println(Arrays.toString(arr));

        int n = arr.length;

        // Ordenamiento burbuja
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}