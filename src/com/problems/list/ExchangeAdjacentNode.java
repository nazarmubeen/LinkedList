package com.problems.list;

/*Three pointers are used here to perform this operation
 * prev->curr->next->next.next
 * 1->2->3->4
 * 	we are changing it like
 * 
 * 



*/
public class ExchangeAdjacentNode {
    public Node exchangeAdjacentNodes(Node head) {
        Node temp = new Node(0);
        temp.next = head;
        Node prev = temp, curr = head,next=head.next;
        while(curr != null && next != null){
           curr.next=next.next;
           next.next=curr;
           prev.next=next;
           prev=curr;
           next=curr.next.next;
           curr=curr.next;
        }
        return temp.next;
    }



}
