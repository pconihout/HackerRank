import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        
        /* Enter your code here. Print output to STDOUT. */
        System.out.print(A.length() + B.length() + "\n");
        
        if (A.compareTo(B) > 0)
            System.out.print("Yes\n");
        else
            System.out.print("No\n");
        
        System.out.print( A.substring(0, 1).toUpperCase() + A.substring(1) );
        System.out.print(" ");
        System.out.print( B.substring(0, 1).toUpperCase() + B.substring(1) );
    }
}
