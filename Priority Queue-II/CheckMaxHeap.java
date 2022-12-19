public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		int n = arr.length;
        boolean ans = true;
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                continue;
            }
            else
            {
               return false;
            }
        }
        return ans;
	}
}
