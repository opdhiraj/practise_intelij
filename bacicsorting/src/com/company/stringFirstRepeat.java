package com.company;
import java.util.*;
public class stringFirstRepeat {



        private static int findFirstRepeatedChar(String str){


            //write your code here
            int p = -1, i, j;
            for ( i = 0; i < str.length(); i++)
            {
                for ( j = i + 1; j < str.length(); j++)
                {
                    if (str.charAt(i) == str.charAt(j))
                    {
                        p = i;
                        break;
                    }
                }
                if (p != -1)
                    break;
            }

            return p;



        }

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int index = findFirstRepeatedChar(str);
            if(index != -1){
                System.out.println(str.charAt(index));
            }
            else{
                System.out.println("NA");
            }
        }
    }

