import java.util.Arrays;
public class sortArray {



        public static void main(String[] args) {
            int[] array = {29,34,12,45,56,02,43, 19};

            // write code to use the Array function
            Arrays.sort(array);
            for(int i=0; i<array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }


