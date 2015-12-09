import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static List<Integer> pos = new ArrayList<Integer>();

    private static int solve(long[] a) {
        // Solve the problem without using Queues...

        for (int position : pos) {

            long sum = 0;

            for (int i = position; i < a.length; i++) {
                sum += a[i];

                if (sum < 0)
                    break;
            }

            for (int i = 0; i < position; i++) {
                if (sum < 0)
                    break;
                
                sum += a[i];
            }

            if (sum >= 0)
                return position;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] a = new long[N];

        for (int i = 0; i < N; i++) {
            long temp = sc.nextLong() - sc.nextLong();

            a[i] = temp;
            if (temp > 0) {
                pos.add(i);
            }
        }

        int result = solve(a);
        System.out.println(result);
    }
}