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
        
        int[] myList = new int[n];
        int sum=0;
        int sumSubarray = 0;
        
        for (int i=0;i<n;i++)
            myList[i] = sc.nextInt();
        
        
        for (int i=0;i<n;i++) {
            
            for (int j=i;j<n;j++) {
                sum += myList[j];
                
                if (sum < 0) 
                    sumSubarray++;
                    
            }     
            
            sum = 0;
        }
        
        System.out.println(sumSubarray);
            
    }
}