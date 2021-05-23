import java.util.Scanner;

public class gcdORhcf {


    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter First number : ");
            int n1 = input.nextInt();
            System.out.print("Enter second number : ");
            int n2 = input.nextInt();
        System.out.println("GCD of " + n1 +" and " + n2 + " is "+ gcd(n1,n2));

}

      public static int gcd(int n1,int n2){
        if (n1==0){
            return n2;
          }
        if (n2==0){
            return n1;
        }
        if (n1==n2){    //base case
            return n1;
        }
        if (n1>n2){
            return gcd ((n1-n2),n2);
        }else{
            return gcd (n1,(n2-n1));
        }




    }
}