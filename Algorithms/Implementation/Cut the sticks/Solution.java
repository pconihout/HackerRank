import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int max = 0;
        int min = arr[0];
        int count = 0;
        
        for(int k=0; k < n; k++){
            for(int i=0; i < n; i++){

                if (arr[i] < min && arr[i] > 0)
                    min = arr[i];
                if (arr[i] > max)
                    max = arr[i];
            }

            for (int j=0;j<n;j++) {
                if (arr[j]-min >= 0) {
                    arr[j] = arr[j] - min;
                    count++;
                }
            }
            
            min = max;

            if (count != 0) {
            System.out.println(count);
            count = 0;
            }
        }
    }
}
