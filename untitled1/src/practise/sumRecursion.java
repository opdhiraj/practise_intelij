package practise;
import java.util.Scanner;
public class sumRecursion {

        public static int sum(int num) {   // num= 492
            if (num==0) {
                return 0;
            }

                  return (num%10+sum (num/10));
                }

        public static void main(String[] args) {
            Scanner input =new Scanner (System.in) ;           //read the input number
            int num= input.nextInt()  ;
             int add=sum(num);                                                        //pass the number to sum() method
            System.out.println(add );
        }
    }


