
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
  	int n = str.length();
		int max = -1;
		int count = 0;
		char ans=' ';
		int maxIndex = 0;
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{	
				if(str.charAt(i)==str.charAt(j)) {
					count+=1;
				}
				if(count>max)
				{
					max = count;
					maxIndex = i;
				}
				
			}
            ans = str.charAt(maxIndex);
			count=0;
		}
        
        return ans;
	}
}
