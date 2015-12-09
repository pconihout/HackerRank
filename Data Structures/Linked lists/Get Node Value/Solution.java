/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
   
   Node topHead = head;
   int index = 0;
    
   while (head.next != null) {
       index++;
       head = head.next;
   }
    
   head = topHead;
   n = index - n;
   index = 0;
    
   while (head.next != null && index < n) {
       
       index++;
       head = head.next;
   }
    
   return head.data;


}
