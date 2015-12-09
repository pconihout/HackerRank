import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        int mod=0;
            
        for(int i=1;i<ar.length;i++){
            int value=ar[i];
            int hole=i;
            
            
            while(hole >= 1 && ar[hole-1] > value){
                ar[hole]=ar[hole-1];
                hole--;
                mod++;
            }
            
            ar[hole]=value;
            //printArray(ar);
        }        
        System.out.println(mod);
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    


}