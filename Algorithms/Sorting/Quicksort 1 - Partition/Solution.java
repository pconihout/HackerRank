import java.util.*;
public class Solution {
       
       static void partition(int[] ar) {
           int n = ar.length;
           List<Integer> small = new ArrayList<Integer>();
           List<Integer> big   = new ArrayList<Integer>();
           
           for(int i=1;i<n;i++){
               if (ar[i] < ar[0]) 
                   small.add(ar[i]);
               else
                   big.add(ar[i]);
           }
           small.add(ar[0]);
           
           for(int i=0;i<small.size();i++){
               ar[i] = small.get(i);
           }
           
           for(int i=0;i<big.size();i++){
               ar[i+small.size()] = big.get(i);
           }
           
           printArray(ar);
                    
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
           partition(ar);
       }    
   }
