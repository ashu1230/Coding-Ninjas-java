
public class Solution {

public static int countWords(String str) {	
		//Your code goes here
        int count = 1;
        if(str.length()==0)
        {
        	return count = 0;
        }
        for(int i = 0;i<str.length();i++)
        {
        	if(str.charAt(i)==' ')
        	{
        		count++;
        	}
        }
        return count;
	}
}
