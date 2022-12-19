import java.util.Stack;
public class Solution {

    public static boolean isBalanced(String expression) {
//                 Stack<Character> s = new Stack<>();

    
//      for(int i=0;i<exp.length();i++)
//         {
//             if(expression.charAt(i)=='('||expression.charAt(i)=='{'||expression.charAt(i)=='[')
//             {
                
//                 s.push(expression.charAt(i));
//             }
//             else if(!s.isEmpty())
//             {
//          if((expression.charAt(i)=='}'&&s.peek()=='{')||(expression.charAt(i)==']'&&s.peek()=='[')||(expression.charAt(i)==')'&&s.peek()=='('))
//             {
                
//                 s.pop();
                
//             }
             
//             }
//             else 
//                 return false;
            
            
//         }
       
//         return s.isEmpty();
        
        Stack<Character> stack = new Stack<>();
		
		
		if(stack.isEmpty()==true && expression.charAt(0)==')')
		{
			return false;
		}
		for(int i =0;i<expression.length();i++)
		{
			if(expression.charAt(i)=='(')
			{
				stack.push(expression.charAt(i));
			}
			else if(expression.charAt(i)==')'&& (stack.peek()=='(' && stack.isEmpty()!=true)) {
				stack.pop();
			}
			else if(expression.charAt(i)==')' && stack.isEmpty()==true)
			{
				return false;
			}
			
		}
		
		return stack.isEmpty();
	}
    }
