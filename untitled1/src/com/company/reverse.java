package com.company;
import java.util.Scanner;

    class reverse {
        public static int reverseBits(int num) {
            int r = 0;
            while (num > 0) {
                r <<= 1;
                if ((int) (num & 1) == 1) {
                    r ^= 1;
                    num >>= 1;
                }
            }
            return r;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int answer = reverseBits(num);
            System.out.println(answer);
        }

    }
