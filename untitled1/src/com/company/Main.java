package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(binaryToDecimal(5));
    }


        public static String binaryToDecimal(int x){
            String binary="";

            while (x>0){
              int d=  x/2;
                int r=x%2;
                binary=r+binary;
                x=d;
            }
             return binary;
        }
    }

