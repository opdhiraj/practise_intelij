package practise;

public class fun {
    public static void main(String[]args) {



        System.out.println(fun(4));
    }

        public static int fun(int x){

            if(x>0){
                fun(--x);

                System.out.print(x +" ");
                fun(x--);

            }
            return -99;
        }



}
