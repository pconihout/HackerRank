/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    Node currentA = headA;
    Node currentB = headB;
    
    while (currentA != null && currentA.next != null) {
        
        while (currentB != null && currentB.next != null) {
            
            if (currentA.data == currentB.data)
                return currentA.data;
            else
                currentB = currentB.next;
        }
        
        currentB = headB;
        currentA = currentA.next;
    }
    
    return currentA.data;

}
