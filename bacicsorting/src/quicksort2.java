import java.util.*;

public class quicksort2 {

    public static int quickSort(int[] arr, int start, int end) {
        int pivot = arr[start];    //   <-----start or end [(4) 20 10 18 2 6 12 14 8 16]

        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp1 = arr[start];
        arr[start] = arr[end];
        arr[end] = temp1;
        return end;
    }

    void quickSortR(int[] arr, int start, int end) {
        if (start < end) {
            int loc = quickSort(arr, start, end);
            quickSortR(arr, start, loc - 1);
            quickSortR(arr, loc + 1, end);
        }
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}