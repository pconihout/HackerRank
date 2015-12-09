/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    
    Node top = head;
    
    int index = 0;
    
    Node newIns = new Node();
    newIns.data = data;
    newIns.next = null;
    
    //Empty List - Returned newly created node or null
    if (head==null){return newIns;}
    
    //Inserting a Node ahead of the List
    if (position == 0){newIns.next = head; return newIns;}    
    
    while (head.next != null && index < position -1) {
        head = head.next;
        index++;
    }
    
    Node nodeAtPosition = head.next;
    head.next = newIns;
    head.next.next = nodeAtPosition;
    
    return top;
}
