import java.util.*;
public class Solution {  

   public static int secondLargestElement(int[] arr) {
	    	//Your code goes here
		  int n = arr.length;
	        int ans = 0;
	        Arrays.sort(arr);
	        boolean equal = true;
	        
		        for(int i = 0;i<n-1;i++)
		        {
		           if(arr[i]!=arr[i+1])
		           {
		        	   equal = false;
		           }
		        }  
		        for(int i = 0;i<n-1;i++)
		        {
		           if(arr[i]==arr[i+1])
		           {
		        	   arr[i]= -1;
		           }
		        } 
		        
		      Arrays.sort(arr);
	        if(n<=1 || equal==true)
	        {
	            return -2147483648;
	        }
	        
	        else{
	        	ans += arr[n-2];
	        }
	        
	        return ans;
	    }
}

	
