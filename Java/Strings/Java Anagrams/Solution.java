import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
	  A = A.toLowerCase();
	  B = B.toLowerCase();
	  
      char[] lettersA = new char[A.length()];
      char[] lettersB = new char[B.length()];
      
       for (int i=0;i<A.length();i++)
           lettersA[i] = A.charAt(i);
       
       for (int j=0;j<B.length();j++)
    	   lettersB[j] = B.charAt(j);
       
       Arrays.sort(lettersA);
       Arrays.sort(lettersB);
               
       if (Arrays.equals(lettersA, lettersB))
    	   return true;
       else
    	   return false;
   }
               
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
