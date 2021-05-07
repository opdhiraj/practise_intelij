package practise;
import java.util.Scanner;

class perfectNumber{
    public static int perfectNumber(int num) {
        int sum=0;
        for (int i=1;i<num;i++)
             if(num%i==0){

                 sum=i+sum;
                 System.out.println(sum);
             }
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = perfectNumber(num);
        System.out.println(answer);      //   <--------checking
        boolean isPerfectNumber = false;
        if (answer == 1)
            isPerfectNumber = true;
        System.out.println(isPerfectNumber);
    }
}