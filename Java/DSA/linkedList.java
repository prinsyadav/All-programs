import java.util.Scanner;

public class linkedList {
    // traverse the linked list
    public static void traverse(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }

    


}
