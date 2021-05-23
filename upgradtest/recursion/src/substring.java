public class substring {


        static void abc(String s)
        {
            if(s.length() == 0)
                return;
            abc(s.substring(1));


            System.out.print(s.charAt(0));
        }

        public static void main(String[] args) {
            abc("xyz");
        }
    }

