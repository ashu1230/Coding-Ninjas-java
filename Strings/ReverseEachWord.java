
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
	int n = str.length();
		
		String ans= "";
		int end = 0;
		int start=0;
		int i;
		for( i = 0;i<n;i++)
		{	
			if(str.charAt(i)==' ')
			{
				 end = i-1;
				 String rw = "";
				 
				 for(int j = start;j<=end;j++)
					{
						rw=str.charAt(j)+rw;
						
					}
				 ans +=rw+" ";
				 start = i+1;				 	 
			}
		}
		end = i-1;
		 String rw = "";
		 
		 for(int j = start;j<=end;j++)
			{
				rw=str.charAt(j)+rw;
				
			}
		 ans +=rw;
		return ans;
	}
}
