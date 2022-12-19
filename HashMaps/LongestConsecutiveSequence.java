import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
           map.put(arr[i],1);  
        }
        
        int overallcount=0,maxStart=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            
            if(!map.containsKey(arr[i]-1))
            {
                int currentcount = 1;
                int currentstart = arr[i];
                
                while(map.containsKey(currentstart+1))
                {
                    currentcount++;
                    currentstart=currentstart+1;
                }
                if(currentcount>overallcount)
                {
                    overallcount=currentcount;
                    maxStart = arr[i];
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(maxStart);
        ans.add(maxStart+overallcount-1);
        
        return ans;
    }
}
