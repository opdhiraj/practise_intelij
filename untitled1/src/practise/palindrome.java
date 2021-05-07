package practise;
import java.util.Scanner;

class palindrome {
    public static int palindrome(int num) {
        int a=num;     //121
        int rev=0,rem;
        while (a>0){
           rem= a%10;
           rev=rev*10+rem;
           a=a/10;
        }
return rev;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = palindrome(num);
        boolean isPalindrome = false;
        if (answer == num)
            isPalindrome = true;
        System.out.println(isPalindrome);
    }
}