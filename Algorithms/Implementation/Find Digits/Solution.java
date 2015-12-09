import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            String number = String.valueOf(n);
            for(int i = 0; i < number.length(); i++) {
                int j = Character.digit(number.charAt(i), 10);
                
                try {
                    if (n%j==0)
                        count++;
                }
                catch (java.lang.ArithmeticException e) {}
                    
            }
            System.out.println(count);
            count=0;
        }
    }
}
