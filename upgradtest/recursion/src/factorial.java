public class factorial {
    public static void main (String[]args){
        System.out.println(fact(5));

    }

    static  int fact(int a){
        if(a==0||a==1){
            return 1;
        }

     else{
         return a*fact(a-1);

        }
    }
}
