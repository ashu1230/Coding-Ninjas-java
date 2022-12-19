import java.util.*;
public class Solution {

    public static void intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr1.length;i++)
        {
            if(map.containsKey(arr1[i]))
            {
                int value = map.get(arr1[i]);
                value+=1;
                map.put(arr1[i],value);
            }
            else
            {
                map.put(arr1[i],1);
            }
        }

        for(int j = 0;j<arr2.length;j++)
        {
            if(map.containsKey(arr2[j]))
            {

                int value = map.get(arr2[j]);

                if(value>0)
                {
                    System.out.print(arr2[j]+" ");
                    value--;
                    map.put(arr2[j],value);
                }

            }
        }
    }
}
