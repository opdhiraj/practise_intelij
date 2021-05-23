import java.util.Scanner;
public class findPrimeN {
    public static void main(String[] args) {           //time complexity=o(n*log(log(n)))
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=input.nextInt();
           sieve(n);

    }
    public static void sieve(int n){
      int[] prime=new int[n+1];
       // prime[0]=0;
       // prime[1]=0;
      for(int i=2;i<=n;i++){
          prime[i]=1;

        //  System.out.print(prime[i]+" ");  //

        }
      for (int i=2;i<=Math.sqrt(n);i++){
          if(prime[i]==1){
              for(int j=2;i*j<=n;j++){
                  prime[i*j]=0;
                //  System.out.print(prime[i*j]+" ");//
              }
          }
      }

        for (int i = 2; i <= n; i++)
        {
            if (prime[i] == 1)
                System.out.print(i + " ");
        }





    }

}
