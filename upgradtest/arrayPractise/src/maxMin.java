public class maxMin {
    public static void main(String args[]) {


        int[] arr = {1000, 11, 445, 1, 330, 3000};
        System.out.println("minimum number is" + " " + min(arr));
          System.out.println("maximum number is" + " " + max(arr));

    }

    public static int min(int[] array) {
        int minimum = array[0];
        if (array.length <= 0) {
            System.out.println("invalid");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }



    public static int max(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i]>maximum){
               maximum=array[i];
           }
        }
        return maximum;
    }
}

