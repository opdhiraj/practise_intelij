package com.company;
import java.util.*;
public class sortStack {



        public static void main(String args[]) {
            Stack<Integer> stack = new Stack<>();
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            while (n-- > 0)
                stack.push(s.nextInt());
            sort(stack);

        // Method to sort the elements of the stack in ascending order
        static void sort(Stack<Integer> stack<>() {
            // Write your code here


            while(!input.isEmpty())
            {

                int tmp = input.pop();


                while(!stack.isEmpty() && stack.peek()
                        > tmp)
                {

                    input.push(stack.pop());
                }


                stack.push(tmp);
            }
            return stack;
        }

        Stack<Integer> stack=sortstack(input);
        System.out.println("Sorted numbers are:");

        while (!stack.empty())
        {
            System.out.print(stack.pop()+" ");
        }


    }
}
