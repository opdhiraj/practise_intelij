import java.util.Scanner;

public class arrayRotation {

    public static void main(String args[]) {
        int k;

        Scanner input = new Scanner(System.in);
        System.out.println("enter rotation");
         k = input.nextInt();

        System.out.println("enter size");

        int n = input.nextInt();
        System.out.println("Enter " + n + " integers");

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }


    }


    public static void rotation(int[] arr, int k, int n) {
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {

            temp[i] = arr[i];

        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = n - k, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }

        for (int i = 0; i >= n; i++) {
            System.out.println(arr[i]);

        }


   }
}


/*
