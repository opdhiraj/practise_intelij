import java.util.Scanner;

public class allFactor {


    public static void main(String[] args) {           //
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        factors(n);


    }

    public static void factors(int n) {
        int[] a = new int[n+1];
        if (n==1){
            System.out.println("1");
        }
        else if(n<1){
            System.out.println("no factor");
        }
        else{
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a[i] = i;


                System.out.print(a[i] +" ");
            }

            }
        }

    }
}
