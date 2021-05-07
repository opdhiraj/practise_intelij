package com.company;
import java.util.*;
public class median1 {



        public static int median(int[] arr1, int[] arr2) {

            int len = arr1.length + arr2.length;
            int a= len/2;
            int[] arr3 = new int[len];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i];
            }
            for (int i = 0 ; i < arr2.length; i++) {
                arr3[arr1.length+i] = arr2[i];
            }
            for (int i = 0; i < len; i++) {
                System.out.println(arr3[i] + " ");


            }
            return arr3[a];

        }

        public static void main(String []args) {
            Scanner s = new Scanner(System.in);
            int size1 = s.nextInt();
            int[] arr1 = new int[size1];
            for(int i = 0; i < size1; i++) {
                arr1[i] = s.nextInt();
            }
            int size2 = s.nextInt();
            int[] arr2 = new int[size2];
            for(int i = 0; i < size2; i++) {
                arr2[i] = s.nextInt();
            }
            int answer = median(arr1, arr2);
            System.out.print(answer);
        }


}
