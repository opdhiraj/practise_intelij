package practise;
import java.util.Scanner;
public class palindromeRecursion {



        public static int palindrome(int num, int i) {//num 121;  i =storing number after reverse
            if (num == 0)
                return i;
            i =  (num % 10)+(i * 10);

            return palindrome(num / 10, i);
        }


        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int answer = palindrome(num, 0);
            boolean isPalindrome = false;
            if (answer == num)
                isPalindrome = true;
            System.out.println(isPalindrome);
        }


}
