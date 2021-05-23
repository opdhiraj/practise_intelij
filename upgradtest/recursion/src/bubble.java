import java.util.Scanner;

public class bubble {


    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A[] = new int[N];
        for (int k = 0; k < N; k++) {
            A[k] = input.nextInt();




        }
    }

   static void printArray(int a []) {
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        //System.out.println();
    }


    public static void bubble1(int A[], int N) {
        int temp;
        int c = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    c++;
                }
            }
        }

        System.out.println(c);
    }

}



