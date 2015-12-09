/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view_left(Node root)
{
    if (root.left != null)
        top_view_left(root.left);
    
    System.out.print(root.data + " ");
}
void top_view_right(Node root)
{
    Node current = root;
    
    while (current != null){
        if (current != root)
            System.out.print(current.data + " ");
        
        current = current.right;
    }
    
    
}
void top_view(Node root)
{
    top_view_left(root);
    top_view_right(root);
}
