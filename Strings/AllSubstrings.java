
public class Solution {

	public static void printSubstrings(String str) {
	int n = str.length();
		
		String ans = "";
		
		int i=0;
		while(i<n)
		{	
			int j = i;
			while(j<n)
			{
				ans+=str.charAt(j);
				System.out.println(ans+" ");
				j++;
				
			}
			ans = "";
			i++;
		}
		
		
	}
}
