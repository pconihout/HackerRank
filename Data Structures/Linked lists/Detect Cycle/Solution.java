/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
    
    if (head == null)
        return 0;
    
    Node slow = head, fast = head;
    
    while (true) {
        slow = slow.next;
        
        if(fast.next != null)
            fast = fast.next.next; 
        else
            return 0;
        
        if(slow == null || fast == null) 
            return 0;

        if(slow == fast) 
            return 1;
    }
    
}
