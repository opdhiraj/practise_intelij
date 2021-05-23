import java.util.*;

public class countHashMap {

        public static int countOfOccurance(String s , char c) {

            String str = s.replaceAll("\\s", "").toLowerCase();
            c = Character.toLowerCase(c);
            Map<Character, Integer> map = new HashMap<>();
            for(int i=0 ;i<str.length();i++) {
                if(map.get(str.charAt(i))==null) {
                    map.put(str.charAt(i), 1);
                }else {
                    map.put(str.charAt(i), map.get(str.charAt(i))+1);
                }
            }
            if(map.get(c)==null) {
                return 0;
            }else {
                return map.get(c);
            }
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();
            char c = sc.next().charAt(0);
            System.out.println(countOfOccurance(str1,c));
        }
    }

