import java.util.Scanner;
public class bubbleSort {


        public  static void printIndex(int[] arr) {
            for (int i=0;i<arr.length;i++) {           //[9 3 1 0 4]
                boolean flag = false;
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        flag = true;
                    }

                }
                if (flag == false) {
                    break;

                }

            }

            for(int i=0;i< arr.length;i++) {
                System.out.println(arr[i]);
            }

        }
        public static void main(String[] args)
        {
            bubbleSort ob = new bubbleSort();
            int arr[] = {9,3,1,0,4};
            ob.printIndex(arr);
            int []arrI=new int [arr.length];
            for(int i=0;i< arrI.length;i++){
                arrI[i]=i;
            }
            System.out.println("Sorted array");

            }

        }

