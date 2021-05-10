import java.util.*;
public class quickSort {


    public static int quickkSort(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];    //   <-----start or end
        while (start <= end)       //  [9 1 0 36 8]
        {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        return start;

    }


    void quickSortRecursion(int[] arr, int start, int end) {
        int pi = quickkSort(arr,start, end);
        if (start < pi - 1) {
            quickSortRecursion(arr, start, pi - 1);
        }
        if (pi < end) {
            quickSortRecursion(arr, pi, end);
        }
    }



    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
        quickkSort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

