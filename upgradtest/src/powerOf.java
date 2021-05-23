import java.util.*;
public class powerOf {




        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            System.out.println(powerOfTwoNumbers(n));
        }
        // Method to check whether the given number is a special number or not
        static boolean powerOfTwoNumbers(int n) {
            // Write your code here
            for (int x=2;x<=Math.sqrt(n);x++){
                int y=2;
                double p=Math.pow(x,y);
                while(p<=n && p>0){
                    if(p==n)
                        return true;
                    y++;
                    p=Math.pow(x,y);

                }
            }
            return false;
        }
    }

