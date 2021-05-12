package com.company;
import java.util.Scanner;
public class countPassesBubble {



        static int totalBubbleSortSwaps(int[] array, int m) {
            for (int i = 0; i < array.length; i++) {
                boolean flag = false;


                int temp = 0;
                for (int j = 0; j < array.length - i - 1; j++) {
                    int count=0;
                    if (array[j + 1] > array[j]) {
                        temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                        flag = true;
                        count++;
                        System.out.println(count);

                    }

                }
                if (flag == false) {
                    break;
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }

            return 0;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int size = scanner.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(totalBubbleSortSwaps(array, m));
        }
    }

