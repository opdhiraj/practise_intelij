import java.util.*;
import java.util.*;
import java.util.Queue
public class queueI {


        public static class Node {
            private int data;
            private Node next;

            Node(int data) {
                super();
                this.data = data;
            }

            public int getData() {
                return data;
            }

            public void setData(int data) {
                this.data = data;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }
        }
        public static class Queue {
               Node front,rear;
            public Queue(){

                this.front=this.rear=null;
            }
            int enQueue(int key) {
                Node temp = new Node(key);
                if (this.rear == null) {

                    this.front = this.rear = temp;

                }
                this.rear.next = temp;
                this.rear = temp;
                return front.data;
            }
               int deQueue(){
                if(this.front==null)
                    return -1;

                this.front=this.front.next;

                if(this.front==null)
                this.rear=null;
                   return front.data;
                }
            }



        public static void main(String[] args){
            Queue Q = new Queue();
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            /*Enter the elements of the stack */
            for (int i = 0; i < n; i++) {
                Q.enQueue(in .nextInt());
            }
            for (int i = 0; i < n; i++) {
                System.out.println(Q.deQueue());
            }
        }
    }

str=str1.replace