import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc = new Scanner (System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        int n = sc.nextInt();
        
        
        ArrayList<BigInteger> fibo = new ArrayList<>(n);
        fibo.add(0, a);
        fibo.add(1, b);
        

        for (int i=2;i<n;i++)  
        	fibo.add(i, fibo.get(i-1).multiply(fibo.get(i-1)).add(fibo.get(i-2)) );
        
       
        
        System.out.println(fibo.get(n-1));
        
        
    }
}