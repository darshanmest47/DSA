package programesDSA.LinkedLists;

public class LinkedNode {
    int data;
    LinkedNode next;

    public LinkedNode(int data){
     this.data=data;
     this.next=null;
    }

    static int counter=0;
    public static void display(LinkedNode current){
        while(current!=null){
            System.out.print(current.data+"----->");
            current=current.next;
            counter++;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("The Size of Singly Linkedlist is "+counter);
        counter=0;

    }

    public static LinkedNode addFirst(LinkedNode current,LinkedNode start){
        start.next=current;
        current=start;
        LinkedNode head = current;
        return head;
    }

    public static void  addLast(LinkedNode testnode,LinkedNode head){
        LinkedNode current;
        if(head==null){
            head=testnode;
            display(head);
            return;
           }
           else{
            current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=testnode;
           }
    
            display(head);

    }

    
}
