import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean pal = true;
        /* Enter your code here. Print output to STDOUT. */
        
        if (A == null) {            
            return;
        }
            
        
        for (int i=0;i < A.length()/2;i++)
            if (A.charAt(i) != A.charAt(A.length() - 1 - i) && pal)
                pal = false;
            
        if (pal)
            System.out.print("Yes");
        else
            System.out.print("No");
               
        
    }
}
