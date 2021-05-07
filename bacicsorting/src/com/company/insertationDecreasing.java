package com.company;
import java.util.Scanner;
public class insertationDecreasing {



        public static void insertionSortDescending(int array[]) {
            for (int i=1;i<array.length;i++){    //    i-->
                int temp=array[i];                // [2 3 0 1]
                int j=i-1;                   //      <--j
                while (j>=0 &&array[j]<temp){
                    array[j+1]=array[j];
                    j--;

                }
                array[j+1]=temp;     //  [5 4 3 2]
            }
            for (int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            insertionSortDescending(array);
        }
    }

