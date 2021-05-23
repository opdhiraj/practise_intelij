import java.util.*;
import java.lang.*;
public class reverseCll {


        static Node head;
        static class Node {
            int data;
            Node next;
            Node(int i) {
                data = i;
                next = null;
            }
        }

        static reverseCll insert(reverseCll list, int data) {
            Node new_node = new Node(data);
            new_node.next = null;
            if (list.head == null)
                list.head = new_node;
            else {
                Node last = list.head;
                while (last.next != head) {
                    last = last.next;
                }
                last.next = new_node;
            }
            new_node.next=head;
            return list;
        }
        static Node reverseCircular(Node headRef) {
            //write your code here

            if (headRef == null)
                return null;


            Node prev = null;
            Node current = headRef;
            Node next;
            do
            {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            } while (current != (headRef));


            (headRef).next = prev;
            headRef = prev;
            return headRef;
        }

        static void printCircular(Node head) {
            //write your code here
            if (head == null)
                return;

            Node temp = head;
            do
            {
                System.out.print( temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        public static void main(String[] args) {
            reverseCll list = new reverseCll();
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            for(int i=0;i<n;i++)
                list = insert(list,sc.nextInt());
            head = reverseCircular(head);
            printCircular(head);
        }
    }

