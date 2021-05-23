import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        if(isPrime(n)){
            System.out.println(n + " is  a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }


    }

    public static boolean isPrime(int n) {

        if (n == 0 || n == 1|| n<0 ) {

            return false;
        }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;

                }

            }
            return true;
        }

    }

