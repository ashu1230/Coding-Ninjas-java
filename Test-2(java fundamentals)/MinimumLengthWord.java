
public class Solution {
	
public static String minLengthWord(String input){
		
		int startIndex = 0;
			int endIndex = 0;
			int min = Integer.MAX_VALUE;
			int count = 0;
			String ans = "";
			String minans= "";
			
			for(int i = startIndex;i<input.length();i++)
			{
				if(input.charAt(i)==' ')
				{
					endIndex = i;
					ans = input.substring(startIndex, endIndex); //substring(0,4)
					
					for(int k = 0;k<ans.length();k++)
					{
						count++;
					}
					if(count<min)
					{
						min = count;
						minans = ans;
					}
					else
					{
						continue;
					}
					
					
				}
				count = 0;
				startIndex = endIndex+1;
				
			}
			//System.out.println(startIndex+" "+endIndex);
			
			String nans = "";
			nans=input.substring(endIndex+1,input.length());
			if(nans.length()<minans.length())
			{
				minans = nans;
			}
			
			return minans;
		}
}
