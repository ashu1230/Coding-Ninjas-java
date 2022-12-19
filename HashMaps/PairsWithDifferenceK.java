import java.util.*;
public class Solution {

    public static int getPairsWithDifferenceK(int arr[], int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        if(k!=0)
        {
            for(int i =0;i<arr.length;i++)
            {
                int p1 = arr[i]+k;
                int p2 = arr[i]-k;

                if(map.containsKey(p1))
                {
                    count+=map.get(p1);
                }
                if(map.containsKey(p2))
                {
                    count+=map.get(p2);
                }

                if(!map.containsKey(arr[i]))
                {
                    map.put(arr[i],1);
                }
                else if(map.containsKey(arr[i]))
                {
                    int value = map.get(arr[i]);
                    value++;
                    map.put(arr[i],value);
                }
            }
        }
        if(k==0)
        {
            for(int i =0;i<arr.length;i++)
            {
                if(!map.containsKey(arr[i]))
                {
                    map.put(arr[i],1);
                }
                else if(map.containsKey(arr[i]))
                {
                    int value = map.get(arr[i]);
                    value++;
                    map.put(arr[i],value);
                }

            }

            for(int i =0;i<arr.length;i++)
            {
                int n = map.get(arr[i]);
                if(n>0){
                    count+=(n*(n-1)/2);
                    map.put(arr[i],0);
                }
            }



        }

        return count;
    }

}
