package linkedList;

public class countNodesInLinkedList {

    class Node{
        int data;
        Node next;

        Node(int a){
            data = a;
            next = null;
        }

    }
    public static void main(String[] args) {

    }

    public static int getCount(Node head)
    {

        Node curr=head;int count =0;
        while(curr!=null){
            count++;curr=curr.next;
        }
        return count;
    }
}
