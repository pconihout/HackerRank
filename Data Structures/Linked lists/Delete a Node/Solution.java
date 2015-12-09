/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node topHead = head;
    int index = 0;
    
    if (head == null)
        return null;
    
    if (position == 0)
        return head.next;
    
    while (head.next != null && index < position-1 ) {
        head = head.next;
        index++;
    }
    
    head.next = head.next.next;
    
    return topHead;
}

