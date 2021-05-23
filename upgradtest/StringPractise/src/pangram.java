
public class pangram {                      //all 26 letters are present in string
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        if (alphabets(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }

    public static boolean alphabets(String str) {
        boolean[] str1 = new boolean[26];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
                System.out.println(index);          //
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
                System.out.print(index+" ");
            } else {
                continue;
            }
            str1[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (str1[i] == false) {

                return false;
            }


        }

        return true;
    }
}