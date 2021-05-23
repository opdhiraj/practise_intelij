import java.util.*;
public class arrayRotation {

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            int d = s.nextInt();
            rotateArray(arr, n, d);
        }

        // Method to rotate array left by d elements
        static void rotateArray(int[] arr, int n, int d) {
            // Rotating array by n+i elements is equivalent to rotating array by i elements
            d %= n;
            int i, j, k, temp;
            for (i = 0; i < gcd(n, d); i++) {
                // Store starting value of each set
                temp = arr[i];
                j = i;
                while (true) {
                    k = j + d;
                    if (k >= n)
                        k = k - n;
                    if (k == i)
                        break;
                    // Store arr[i+d] in arr[i]
                    arr[j] = arr[k];
                    j = k;
                }
                arr[j] = temp;
            }
            for (i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }

        // Method to find gcd of two numbers
        static int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }
    }


