public class Solution {

	public static int findDuplicate(int[] arr) {
		int dup = 0;
		int sall = 0;
        for(int i =0;i<arr.length;i++)
        {
            sall+=arr[i];
        }
        int sleft = ((arr.length-2)*(arr.length-1)/2);
        dup = sall -sleft;
		return dup;
	}
}
