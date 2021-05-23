import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class median {

        public static void main(String[] args) throws FileNotFoundException {
            File fileName = new File("C:\\Users\\OM\\Downloads");
            Scanner input = new Scanner(fileName);
            int count = 0;
            int sum = 0;
            while (input.hasNext()) {
                count++;

                int number = input.nextInt();
                sum = number + sum;
            }
            int mean = sum / count;
            System.out.println(mean);

        }
    }
// access is denied
