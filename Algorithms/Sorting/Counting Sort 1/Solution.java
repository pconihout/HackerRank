import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

      public static void countingSort(int[] ar) {
          int count;
          
          for (int i=0;i<100;i++) {
              count = 0;
              for (int j=0;j < ar.length;j++) {
                  if (ar[j] == i)
                      count++;
              }
              
              System.out.print(count + " ");
              
          }
      }
    
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           countingSort(ar);
       }
}