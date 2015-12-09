import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        String str = sc.next();
        
        int val = sc.nextInt();
        
        String max = str.substring(0,val);
        String min = str.substring(0,val);

        for(int i=0; i+val <= str.length(); i++){           
            if(str.substring(i, i+val).compareTo(min)<0) 
               min = str.substring(i, i+val);
            if(str.substring(i, i+val).compareTo(max)>0) 
               max = str.substring(i, i+val);
        }

        System.out.println(min);
        System.out.println(max);
        
    }
}