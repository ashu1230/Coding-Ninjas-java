import java.util.*;
public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i =0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int value = map.get(arr[i]);
				value++;
				map.put(arr[i],value);
			}
			else
			{
				map.put(arr[i],1);
			}
		}

		int maxFreq = 0;
		int max = Integer.MIN_VALUE;
		for(int i : arr) {
			if( maxFreq < map.get(i) ) {
				maxFreq = map.get(i);
				max = i;
			}
		}


		return max;
	}
}
