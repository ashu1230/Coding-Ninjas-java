public class solution {

	public static int convertStringToInt(String input){
		{
			if(input.length()==0)
			{
				return 0;
			}
			int ans = 0;
			if(input.charAt(0)==0)
			{
				convertStringToInt(input.substring(1));
			}
			else
			{
				 ans = Integer.parseInt(input);
			}
			return ans;
		}
	}
}
