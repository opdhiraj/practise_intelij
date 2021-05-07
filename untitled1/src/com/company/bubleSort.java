package com.company;

import java.util.*;

public class bubleSort {


    public static void descendingBubbleSort(int arr[], int size) {
        boolean flag;
        int temp;
        for (int i = 0; i < size; i++) {
            flag = false;
            for (int j = 0; j < size; j++) {
                if (arr[j ] < arr[j+1]) {
                    temp = arr[j];     //3 4 2 1 3
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }
            }
            if (flag = false) {


            }
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        descendingBubbleSort(arr, size);
    }
}

