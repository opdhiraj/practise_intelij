package com.company;
import java.util.Scanner;
public class sorting {



        public static void selectionSortAfterNIterations(int[] arr , int n) {
            for (int k=0;k<n;k++){
                int min=k;
                for (int l =k+1;l<arr.length;l++){          //write your code here
                    if (arr[l]<arr[min]){
                        min=l;
                    }
                }

                int temp=arr[min];               // [ 7 2 8 3 4]
                arr[min]=arr[k];
                arr[k]=temp;
            }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }


        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int array[] = new int[size];
            for (int j = 0; j < size; j++) {
                array[j] = scanner.nextInt();
            }
            int i = scanner.nextInt();
            selectionSortAfterNIterations(array, i);
        }
    }