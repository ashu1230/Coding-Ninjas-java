
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
	int n = str.length();
		String ans= "";
		for(int i = 0;i<n;i++)
		{
			if(str.charAt(i)==ch)
			{
				continue;
			}
			else
			{
				ans+=str.charAt(i);
			}
		}
		return ans;
	}
}
