
package com.company;
import java.util.*;
public class stringCommon {


        static String removeCommonChar(String str1, String str2)
        {

            String commonChars = "";

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        commonChars += str1.charAt(i);
                    }
                }
            }

            for(int i = 0; i < commonChars.length(); i ++) {
                String charToRemove = commonChars.charAt(i)+"";
                str1 = str1.replace(charToRemove, "");
                str2 = str2.replace(charToRemove, "");
            }


            return str1;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println(removeCommonChar(str1, str2));
        }
    }

