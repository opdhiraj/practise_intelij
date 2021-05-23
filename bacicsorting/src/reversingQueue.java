import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class reversingQueue {


    reversingQueue  q = new reversingQueue() ;
public boolean isEmpty(){
    return int front==1
}

        public static void func(reversingQueue q) {

            Stack<Integer> s = new Stack<>();                     //write your code here
            while(!q.isEmpty()){
                s.push(q.dequeue());

            }
            while(s.isEmpty()){
                q.enqueue(s.pop());
            }


        }

        public static void main(String arg[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                q.add(in.nextInt());
            }
            func();
            System.out.println(q);
        }
    }


