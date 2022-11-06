package programesDSA.LinkedLists;

public class Singly {
    public static void main(String[] args) {

        LinkedNode head;
        
        //creating Nodes 
        head = new LinkedNode(10);
        LinkedNode second = new LinkedNode(20);
        LinkedNode third = new LinkedNode(30);

       head.next=second;
       second.next=third;
       LinkedNode.display(head);

       //adding nodes at the beginning of SinglyLinkedlist
       LinkedNode current=head;
       LinkedNode newNode = new LinkedNode(5);
       newNode.next=current;
       current=newNode;
       LinkedNode first = new LinkedNode(1);
       first.next=newNode;
       current=first;
       LinkedNode start = new LinkedNode(0);
       head = LinkedNode.addFirst(current,start);
       LinkedNode.display(head);

       //adding nodes at the end of SinglyLinkedList

       LinkedNode testnode = new LinkedNode(100);
       LinkedNode.addLast(testnode,head);
       LinkedNode test2node=new LinkedNode(105);
       LinkedNode.addLast(test2node, head);
       LinkedNode test3node = new LinkedNode(110);
       LinkedNode.addLast(test3node, head);







       


        
    }
}



