import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int utopianTree = 1;
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            for (int a1 = 1; a1 <= n; a1++) {
                
                if (a1%2 == 1)
                    utopianTree = utopianTree * 2;
                else if (a1%2 == 0)
                    utopianTree++;
            }
            
            System.out.println(utopianTree);
            utopianTree = 1;
        }
        
        
    }
}
