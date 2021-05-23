import java.util.Scanner;
public class power {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // Enter the number
            int number = scan.nextInt();  //number=20
            int result = 1;
            if(number >= 2) {

                while (  result<number   )    // Write loop continuation condition) {


                    result++;


                System.out.print(result);

            } else {
                System.out.print("Please enter an integer >= 2");
            }
            scan.close();
        }
    }


