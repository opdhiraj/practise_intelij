package com.company;

import java.util.Scanner;

class example3 {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("1000"));
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
           int product=1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char a = binary.charAt(i);
            int temp = Integer.parseInt(a+"");
            decimal=product*temp;
            product*=2;
        }
        return decimal ;
    }
}