import java.util.*;
public class maxElement {




        // This function returns the sorted stack
        public static Stack < Integer > sortStack(Stack < Integer > input) {
            //write your code here

            Stack<Integer> tmpStack = new Stack<Integer>();
            while(!input.isEmpty())
            {

                int tmp = input.pop();


                while(!tmpStack.isEmpty() && tmpStack.peek()
                        > tmp)
                {
                    input.push(tmpStack.pop());
                }


                tmpStack.push(tmp);
            }
            return tmpStack;
        }
          

        public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
            //write your code here

            for (int i=0;i<Stack.length;i++)
                if(i==k){
                    System.out.println(k);
                }
        }

    public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add(in.nextInt());
        }
        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }
        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }
        // This is the temporary stack
        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);
    }
}

