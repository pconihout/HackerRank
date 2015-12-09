import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x = sc.nextLine();
        String y = sc.nextLine();
        
        try {
            
            int result = Integer.parseInt(x)/Integer.parseInt(y);
            
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (NumberFormatException e ) {
            System.out.println("java.util.InputMismatchException");
        }
        catch (Exception e) {
            System.out.println(e);
        }
     
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}