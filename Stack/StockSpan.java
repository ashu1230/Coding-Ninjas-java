
import java.util.Stack;
public class Solution {

    public static int[] stockSpan(int[] price) {
//O(n^2) 
        // 	int n = price.length;
        // 		int ans[]=new int[n];
        // 		int i = n-1;
        // 		while(i>=0)
        // 		{
        // 			int k =i;
        // 			int count = 0;
        // 			for(int j=i-1;j>=0;j--)
        // 			{
        // 				if(price[i]<price[j])
        // 				{					
        // 					break;
        // 				}
        // 				else if(price[i]>price[j])
        // 				{
        // 					count++;
        // 				}	
        // 			}
        // 			i--;	
        // 			ans[k]=count+1;
        // 		}
        // 		return ans;
        //     }
        // }
        
            Stack<Integer> stk = new Stack<>();
            int n = price.length;
            int[] output = new int[n];
            stk.push(0);
            output[0] = 1;
            for (int i = 1; i < n; ++i) {
                while (!stk.isEmpty() && price[stk.peek()] < price[i]) {
                    stk.pop();
                }
                if (stk.isEmpty()) {
                    output[i] = i + 1;
                } else {
                    output[i] = i - stk.peek();
                }
                stk.push(i);
            }
            return output;
        }
    }
