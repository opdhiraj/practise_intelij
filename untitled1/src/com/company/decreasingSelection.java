package com.company;

import java.util.*;

public class decreasingSelection {


    public static void descendingSelectionSort(int arr[], int size) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;

            for (int j = i + 1; j < arr.length; j++) {   //   [1 2 4 5 8] ----->>>>>>>>>[8 2 4 5 1]
                if (arr[j] > arr[max]) {
                    max = j;

                }
            }
            if (max != i) {
                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;

            }
            for ( i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }


            public static void main (String[]args){
                Scanner s = new Scanner(System.in);
                int size = s.nextInt();
                int[] arr = new int[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = s.nextInt();
                }
                descendingSelectionSort(arr, size);
            }


        }