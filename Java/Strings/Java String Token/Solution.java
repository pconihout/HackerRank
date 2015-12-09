    import java.io.*;
    import java.util.*;



    public class Solution {

      
        public static void main(String[] args) 
        {

      
          Scanner scan = new Scanner(System.in);
          String s = scan.nextLine();
           
          s = s.trim();
            
          if(s.length()==0)
            System.out.println("0");
        
          else if (s.length()<400000) {
              String[] parts = s.split("[_\\@ !,?.']+");
              

              System.out.print(parts.length + "\n");

              for (int i=0;i<parts.length;i++)
                  System.out.print(parts[i] + "\n");
          }

        }
    }
