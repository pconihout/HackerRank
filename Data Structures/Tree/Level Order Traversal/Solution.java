   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root){ 
       int height = height(root); 
       
       for(int i=1;i<=height;i++) 
           Level(i, root); 
   }

    void Level(int level, Node root){
        
        if(root == null)
            return;
        
        if(level == 1)
            System.out.print(root.data+" ");
        
        else if (level > 1)
        {
             Level(level-1, root.left );
             Level(level-1, root.right );
        }
    }

    int height(Node root){
        
        if(root != null)
            return Math.max((1+height(root.left)), (1 + height(root.right)));
        
        else
            return 0;   
    }