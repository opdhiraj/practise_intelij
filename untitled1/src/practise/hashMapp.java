package practise;

import java.util.*;


public class hashMapp {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }
        mergeSortedArrays(arr1, arr2);
    }

    public static void mergeSortedArrays(int arr1[], int arr2[]) {
        HashMap<Integer,Boolean>mp=new HashMap<>();
        int len = arr1.length + arr2.length;
        int[] arr3 = new int[len];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];

        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(" " + arr3[i]);
            if (mp.get(arr3[i])==null){
                System.out.println(arr3[i]+" ");
                mp.put(arr3[i],true);
            }

        }

    }

}





