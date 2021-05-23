import java.util.*;
public class arrayRotationOpd {


        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            int d = s.nextInt();
            rotateArray(arr, n, d);
            printarray(arr ,n);
        }
        // Method to rotate array left by d elements
        static void rotateArray(int[] arr, int n, int d) {
            // Write your code here
            for (int i = 0; i < d; i++)
                rotateByOne(arr, n);
        }

           static void printarray(int arr[],int n){
                for(int i=0;i<n;i++)
                    System.out.print(arr[i]+" ");
            }


        static void rotateByOne(int arr[],int n){
            int i,temp;
            temp=arr[0];
            for(i=0;i<n-1;i++){
                arr[i]=arr[i+1];
                arr[n-1]=temp;
            }
        }




    }

