package com.company;

import java.util.Scanner;

class countSetBits{
    public static int numberOfSetBits( int num) {
        int setBits = 0;
        while (num > 0) {

            int rem = num % 2;
            if (rem == 1) {
                setBits++;
            }
            num = num / 2;
        }
        return setBits;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = numberOfSetBits(num);
        System.out.println(count);
    }
}