import java.util.Scanner;

public class primeFactorization {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int n = input.nextInt();
            primeFactor(n);

}
      public  static  void primeFactor(int n){
        for (int i=2;i<=n;i++){
            if (n%i==0){


                while(n%i==0) {
                    n = n / i;


                    System.out.print(i+" ");
                }
            }


        }
        }
}