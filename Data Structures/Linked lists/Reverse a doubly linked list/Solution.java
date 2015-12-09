/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if (head == null || head.next == null)
        return head;
    
    Node newHead = Reverse(head.next); // reverse all but first
    head.next.prev = head.next.next;
    head.next.next = head;
    head.prev = head.next;
    head.next = null;

    return newHead;

}
