package com.company;
import java.util.*;
public class binarySearch {

        public int getComparisons(int[] array, int key) {           //[1 2 3 4 5 6]
            int start = 0, end = array.length - 1;                           // key=5
            int count = 0;
            int middle=0;

            while (start <= end) {

                if (array[middle] == key) {
                    count++;
                    break;

                }
                else if (array[middle] < key) {
                    start = middle + 1;

                }
                else {
                    end = middle - 1;

                }
                if (start>end){
                    count++;
                }

                 middle = (start + end )/ 2;
                count++;
                return count;


            }
            return count;
        }
        public static void main(String args[] ) throws Exception {
            binarySearch bs = new binarySearch();
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            int key = scanner.nextInt();
            System.out.println(bs.getComparisons(array, key));
        }
    }


