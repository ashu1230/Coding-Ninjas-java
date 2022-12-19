
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
    int n1 = str1.length();
		int n2 = str2.length();
		boolean ans=false;
		
        for(int i = 0;i<n1;i++)
        {
            for(int j = 0;j<n2;j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    ans = true;
                    break;
                }
            }
        }
		if(str1.compareTo(str2)==0)
		{
			ans = true;
		}
        
		else
		{
			ans = false;
		}
        
		
		return ans;
	}
}
