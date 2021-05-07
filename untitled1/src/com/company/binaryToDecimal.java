package com.company;

public class binaryToDecimal {
    public static void main(String[] args) {
       String x=new String("101");
        System.out.println(decimal(x));
    }

    public static int decimal(String y) {
       String x=y;
        int a=0;
          int b=1;      // intialization 2^0=1
        int len = x.length();

        for(int i=len-1;i>=0;i--){
            if (x.charAt(i)==1)
                 a=a+b;
            b=b*2;

            }
        return a;
        }
    }


