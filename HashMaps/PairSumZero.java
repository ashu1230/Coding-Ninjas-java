import java.util.*;

public class Solution {
    public static int PairSum(int[] input, int size) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<size;i++)
        {
            if(map.containsKey(input[i]))
            {
                int value = map.get(input[i]);
                value++;
                map.put(input[i],value);
            }
            else
            {
                map.put(input[i],1);
            }
        }

        int finalCount = 0;
        for(int i=0; i < size; i++)
        {
            int key = input[i];
            if(map.containsKey(-key) && map.get(key)!=0)
            {
                int times;
                if (key == (-key)) { //True in case of zero
                    int occurences = map.get(key);
                    times = (occurences * (occurences - 1)) / 2;
                    finalCount = finalCount+times;
                    map.put(key, 0);
                    continue;
                }
                times = map.get(key) * map.get(-key);
                finalCount = finalCount+times;
                map.put(key, 0);
                map.put(-key, 0);
            }
        }
        return finalCount;
    }
}
