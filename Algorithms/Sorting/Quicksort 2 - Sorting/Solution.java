import java.util.*;
public class Solution {
       
      static int partition(int[] ar, int beg, int max) {
           int n = ar.length;
           int v = ar[beg];
          
           List<Integer> small = new ArrayList<Integer>();
           List<Integer> big   = new ArrayList<Integer>();
           
           for(int i=beg+1;i<max;i++) {
               if (ar[i] < v) 
                   small.add(ar[i]);
               
               else
                   big.add(ar[i]);
           }
           small.add(v);
           
           for(int i=0;i<small.size();i++){
               ar[beg+i] = small.get(i);
           }
           
           for(int i=0;i<big.size();i++){
               ar[beg+i+small.size()] = big.get(i);
           }
           
           
           return beg+small.size();        
      }  
    
      static void quickSort(int[] ar, int deb, int max) {
           int mid = 0;
           
           if(deb >= max-1)
                return;
           
           mid = partition(ar, deb, max);
           
           quickSort(ar, deb, mid-1);
           quickSort(ar, mid, max);
          
           printArray(ar, deb, max);       
      }   
 
      static void printArray(int[] ar, int beg, int end) {
         for(int i=beg;i<end;i++){
            System.out.print(ar[i]+" ");
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
           quickSort(ar, 0, ar.length);
       }    
   }
