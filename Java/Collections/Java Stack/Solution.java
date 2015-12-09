import java.util.*;
class Solution{

   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
          
      while (sc.hasNext()) {
        String input=sc.nextLine();
        //Complete the code
        char array[]=input.toCharArray();
        Stack<Character> st=new Stack<Character>(); 

          for(char c : array){

            if(c=='[' || c=='{' || c=='(')
              st.push(c);

            if(!st.empty()) {
              if(c==']' && st.peek()=='[' || c=='}' && st.peek()=='{' || c==')' && st.peek()=='(')
                st.pop();
            }

            else 
              st.push(c);
          }

          if(st.empty())
            System.out.println("true");
          else 
            System.out.println("false");
      }
      
   }
}
