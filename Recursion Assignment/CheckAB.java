public class Solution {

	public static boolean checkAB(String input) {
		
		if(input.length()==0)
		{
			return true;
		}
		boolean ans = true;
		if(input.charAt(0)=='a')
		{
			if(input.length()>2 &&(input.charAt(1)=='b'&& input.charAt(2)=='b'))
			{
				ans = checkAB(input.substring(3));
			}
			else 
			{
				ans = checkAB(input.substring(1));
			}
			
		}
		else
		{
			ans = false;
		}
		
		
		return ans;
	}

}
