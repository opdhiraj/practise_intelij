package com.company;
import java.util.*;
public class string1 {


        public static String reverse(String str) {
            //write your code here
            char c[]=str.toCharArray();
            String rev="";

            for(int i=c.length-1;i>=0;i--){
                rev+=c[i];
            }
            return rev;
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(reverse(str));
        }
    }

