public class fibonacciGfg {
    public static void main(String args[]){
        fiboSeries(10);
        for(int i=0;i<=10;i++){
    System.out.print(fiboSeries(i)+" ");


}
    }
    static int fiboSeries(int n){
        if (n==0){
            return 0;
        }
        else if (n==0||n==1){
            return 1;
        }

        else{
            return fiboSeries(n-1)+fiboSeries(n-2);

        }
    }
}
