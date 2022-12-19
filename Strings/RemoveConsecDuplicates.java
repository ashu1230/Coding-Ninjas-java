
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
	int n = str.length();
		String ans = "";
		ans+=str.charAt(0);
		
		for(int i = 1;i<n;i++)
		{
			if(str.charAt(i)!=ans.charAt(ans.length()-1))
			{
				ans=ans+str.charAt(i);
			}
		}
		
		
		return ans;
	}
}
