package practise;
import java.util.*;
public class printDuplicate {



        public static void main(String []args) {
            Scanner s = new Scanner(System.in);
            int size = s.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
            }
            printDuplicates(arr);
        }
        static void printDuplicates(int arr[]) {
            for(int i=0;i< arr.length;i++) {
                for (int j=i+1;j<arr.length;j++)
                    if(i!=j&&arr[i]==arr[j])

                System.out.println(arr[i]);

            }
                return ;



        }
    }


