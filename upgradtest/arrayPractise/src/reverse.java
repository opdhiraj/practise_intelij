public class reverse {
    public static void main(String[] args) {

        int[] array = {1000, 11, 445, 1, 330, 3000};
        int m=array.length;
       rev(array);
           printA(array,m);

    }
    public static void rev(int []array){
        int n=array.length;
        int start=0;
        int end=n-1;
        int temp;

        if (n==0){
            System.out.println("no element");

        }
       else if (n==1){

         //   System.out.println(array[0]);
        }
        while (start<end){
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;


        }
    }
  static void printA(int [] array, int n ){
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");


        }

    }

}
