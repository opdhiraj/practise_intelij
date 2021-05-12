package com.company;

import java.io.*;
import java.util.*;

public class maxMin {


    public static void alternativeSorting(int[] arr) {
        Arrays.sort(arr);
        int max=0,min=0;
        for (int i = 0; i < arr.length; i++) {
             max = arr[i];min= arr[arr.length-1];
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] >  max) {
                    max = arr[j];
                }

            }

        }
        System.out.println(max);

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        alternativeSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

