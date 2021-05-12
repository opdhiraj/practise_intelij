import java.util.*;

public class deleteLastNode {


    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        deleteLastNode();
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to delete the last node of the LinkedList
    static void deleteLastNode() {          //write your code here
        if (head == null) {    // for no node
            return;
        } else if (head.next == null) {    //for 1 node
            int temp = head.data;
            head = null;
            return;
        } else {
            Node temp = head;
            Node previous = null;
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            previous.next = null;
            return;

        }

    }

}

/*                             find the length o node or number of node
 public int getCount()
    {
    Node temp=head;
     int count=0;
     while(temp!=null){
         count++;
         temp=temp.next;
          }
          return count;
}

 */