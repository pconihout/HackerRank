   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
       
       if (root != null)
            return Math.max(1 + height(root.left),1 + height(root.right));
       
            return 0;
    }
