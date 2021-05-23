

public class selectionSort1 {          //Selection Sort - State of Array

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};


        selectionSort(arr, 2);  // passing arr [] and its size


    }

    static void selectionSort(int[] array, int n) {  //parameter name can be different
        if (n != 0) {
            int count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < array.length; j++) {                //[64       25 12 22 11  ] so j starts with i+1
                    if (array[j] < array[min]) {
                        min = j;

                    }

                }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
                count++;
                if (count == n) {
                    break;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}