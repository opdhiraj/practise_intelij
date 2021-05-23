package com.company;
import java.util.*;
public class stringPalindrome {


        public static boolean isPalindrome(String str) {
            //write your code here

            String  b = "";



            int n = str.length();
            for(int i = n - 1; i >= 0; i--)
            {
                b = b + str.charAt(i);
            }
            if(str.equalsIgnoreCase(b))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(isPalindrome(str));
        }
    }

