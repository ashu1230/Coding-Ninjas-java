import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
		HashMap<Character,Boolean> map = new HashMap<>();
		String ans="";
		for(int i =0;i<str.length();i++)
		{
			char front = str.charAt(i);
			if(!map.containsKey(front))
			{
				map.put(front,true);
				ans+=front;
			}
		}
		
		
		return ans;
	}
}
