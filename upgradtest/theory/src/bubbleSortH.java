
/*
public class bubbleSortH {



    public static void bubble(A[],N){
        int temp;
        for (int i=0;i<N-1;i++){
            for (int j=0;j<N-i-1;j++){
                if(A[j]>A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
 */


import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int n, i, j, temp, c = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    c = c + 1;

                }
            }
        }

        System.out.print(c);

    }

}


