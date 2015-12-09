/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node merge = new Node();
    Node topMerge = merge;
    
    if (headA == null)
        return headB;
    if (headB == null)
        return headA;
    

    
    while(headA != null && headB != null) {
        
        
        if (headA.data <= headB.data || headB == null) {
            merge.data = headA.data;
            headA = headA.next;
        }
        else if (headA.data > headB.data || headA == null) {
            merge.data = headB.data;
            headB = headB.next;  
        }
        
        if (headA != null && headB != null) {
            merge.next = new Node();
            merge = merge.next;
        }
        else 
            merge.next = null;
        
    }
    
    if(headA != null) {
        merge.next = headA;
    }
    if(headB != null) {
        merge.next = headB;
    }
    
    
    return topMerge;
}
