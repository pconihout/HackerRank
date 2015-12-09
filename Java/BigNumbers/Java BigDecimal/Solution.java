import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        String []s=new String[n];
        
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        
        
        //Sorting
        for(int i = 1; i < n ; i++ ){
            String temp = s[i];
            
            int j;
            for (j = i - 1; j>=0 && new BigDecimal(s[j]).compareTo(new BigDecimal(temp))== -1 ; j--) {
                s[j+1] = s[j];
            }
            
            s[j+1] = temp;
        }
      
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}
