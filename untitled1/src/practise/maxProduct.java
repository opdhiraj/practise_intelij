package practise;

import java.util.*;

public class maxProduct {
    public static int maxProduct(int[] arr) {

        int product = 1;
        if (arr.length< 2) {
            System.out.println("no max product");
            return 0;
        }

        for (int i = 0; i <arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = (arr[i] * arr[j]);
                if (temp > product) {
                    product = temp;

                }

            }
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int answer = maxProduct(arr);
        System.out.print(answer);
    }
}



