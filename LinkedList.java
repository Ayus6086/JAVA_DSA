import java.util.*;
public class LinkedList{
    public static void printLinkedList(Node head){
        while(head!=null){
            System.out.print(head.data+ " ");
            head=head.next;
        }
        System.out.println();
    }
    public static int length(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static Node takeInputall(){
        Scanner sc = new Scanner(System.in);
        int data=sc.nextInt();
        Node head=null;
        Node tail=null;
        while(data!=-1){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static Node deleteNode(Node head, int pos){
        if(head==null) return head;
        if(pos==0) return head.next;
        int i=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(i==pos-1){
                prev=temp;
                temp=temp.next;
                i++;
            } 
        }
        if(pos>1) return head;
        prev.next=prev.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.println("n1.data = "+n1.data);
        System.out.println("n2.data = "+n2.data);
        System.out.println("n3.data = "+n3.data);
        System.out.println("n4.data = "+n4.data);
        System.out.println("n5.data = "+n5.data);
        System.out.println("n1.next = "+n1.next);
        System.out.println("n2.next = "+n2.next);
        System.out.println("n3.next = "+n3.next);
        System.out.println("n4.next = "+n4.next);
        System.out.println("n1.next.data = "+n1.next.data);
        Node head=n1;
        head = deleteNode(head,0);
        printLinkedList(head);
        System.out.println(length(head));
        
    }
}
class Node{
    int data;
    Node next;
            Node(int data){
                this.data=data;
                this.next = null;
            }
}