import java.util.Scanner;

public class implement {
    public static void main(String args []){
       Scanner input =new Scanner(System.in);
        System.out.println("enter the size of array"+" ");
        int n=input.nextInt();
        int arr[]=new int[n];


        int end=-1;
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}




       /*

Scanner reader = new Scanner(System.in);

int[] numbers = new int[5];
numbers[0] = 42;
numbers[1] = 13;
numbers[2] = 12;
numbers[3] = 7;
numbers[4] = 1;

System.out.println("Which index should we access? ");
int index = Integer.valueOf(reader.nextLine());

System.out.println(numbers[index]);


      */