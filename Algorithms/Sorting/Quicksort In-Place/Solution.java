import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
     /* Lomuto partition scheme
     
        algorithm quicksort(A, lo, hi) is
            if lo < hi then
                p := partition(A, lo, hi)
                quicksort(A, lo, p - 1)
                quicksort(A, p + 1, hi)

        algorithm partition(A, lo, hi) is
            pivot := A[hi]
            i := lo        // place for swapping
            for j := lo to hi - 1 do
                if A[j] ≤ pivot then
                    swap A[i] with A[j]
                    i := i + 1
            swap A[i] with A[hi]
            return i
    */
       
      static int partition(int[] ar, int deb, int max) { 
          int p = ar[max];
          int i = deb;
          int tmp = 0;
          
          for (int j=deb;j<max;j++) {
              if (ar[j] <= p) {
                  tmp = ar[i];
                  ar[i] = ar[j];
                  ar[j] = tmp;
                  i++;
              }
          }
          
          tmp = ar[i];
          ar[i] = ar[max];
          ar[max] = tmp;
              
          printArray(ar);
          
          
          
          return i;
      }
    
      static void quickSort(int[] ar, int deb, int max) { 
          
          if (deb < max) {
                int p = partition(ar, deb, max);
                quickSort(ar, deb, p - 1);
                quickSort(ar, p + 1, max);
                
          }
      }
    
      static void printArray(int[] ar) {
          
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
    

      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
          
           quickSort(ar, 0, ar.length-1);
       }
}