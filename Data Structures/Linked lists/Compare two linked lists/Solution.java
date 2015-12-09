/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    if(headA == null && headB == null) {
        return 1;
    }
    else {
        if(headA == null && headB != null || headA != null && headB == null || headA.data != headB.data)
            return 0;
        
        else
            return CompareLists(headA.next, headB.next);
        
    }  
}
