package practise;
import java.util.*;

public class reverseRecursion {
    static void reverseInteger(int n) {

        if (n<10) {
            System.out.print(n);
            return;
        }



        else{
            System.out.print(n%10);
            reverseInteger(n/10);

        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverseInteger(n);
    }
}

