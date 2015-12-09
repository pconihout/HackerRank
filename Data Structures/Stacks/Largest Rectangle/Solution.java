import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
        }
        Stack<Integer> s = new Stack<Integer>();
        long maxAr = 0;

        
        int i=0;
        
        for(;i<n;i++){
            // If this bar is higher than the bar on top stack, push it to stack
            if(s.isEmpty() || h[s.peek()]<=h[i]){
                s.push(i);
            }
            else {
                // If this bar is lower than top of stack, then calculate area of rectangle 
                // with stack top as the smallest (or minimum height) bar. 'i' is 
                // 'right index' for the top and element before top in stack is 'left index' i.e x.
                while(!s.isEmpty() && h[s.peek()]>h[i]){
                    int x = s.pop();

                    // Calculate the area with h[x] stack as smallest bar
                    long ar =  h[x]*(s.isEmpty()?i:i-s.peek()-1);
                    if(ar>maxAr){
                        maxAr = ar;
                    }
                
                }
                s.push(i);
            }
                     
        }
        
        while(!s.isEmpty()){
            int x = s.pop();
            //int leftIndex = s.peek();
            long ar = h[x]*(s.isEmpty()?i:i-s.peek()-1);
            if(ar>maxAr){
                    maxAr = ar;
                }
        }
        System.out.print(maxAr);
    }
}