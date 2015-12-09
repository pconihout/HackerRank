import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       

        for(int i=1;i<ar.length;i++){
            int value=ar[i];
            int hole=i;
            
            while(hole >= 1 && ar[hole-1] > value){
                ar[hole]=ar[hole-1];
                hole--;
            }
            
            ar[hole]=value;
            printArray(ar);
        }        
        //printArray(ar);
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
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
