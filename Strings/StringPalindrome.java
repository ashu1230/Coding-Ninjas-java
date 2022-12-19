
public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
       int n = str.length();
		
		boolean pal = true;
		for(int i = 0;i<n;i++)
		{	char one = str.charAt(i);
			for(int j = n-1;j<n-2;j--)
			{	char two = str.charAt(j);
			
				if(one==two)
				{
					pal= true;
				}
				else
					pal= false;
			}
		}
        return pal;
    }
}
