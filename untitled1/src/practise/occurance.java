package practise;
import java.util.*;
public class occurance {
        static int countFreq(int arr[],  int size, int num)
        {
           int count=0;
           for(int i=0;i<arr.length;i++) {
               if (num == arr[i]) {
                   count++;
               }
           }
               return count;
        }
        public static void main(String []args){
            Scanner s = new Scanner(System.in);
            int size = s.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
            }
            int num = s.nextInt();
            int freq = countFreq(arr, size, num);
            if (freq != 0)
                System.out.print(freq);
            else
                System.out.print("NA");
        }
    }

