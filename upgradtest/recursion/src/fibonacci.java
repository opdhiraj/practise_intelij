public class fibonacci {
    public static void main(String args[]) {
        fibo(10);

    }

    static int n1 = 0, n2 = 1, n3 = 0;

    static int fibo(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;       // n1 is assigned the value of n2 and n2 =1  so n1 also become 1
            n2 = n3;   // n2=n3--->n1+n2--->1+1--->2

             System.out.print(" "+n3);
            fibo(count - 1);

        }
        return count;

    }

}