public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		int rs = 0;
        for(int i = 0;i<arr.length;i++)
        {
            rs+=arr[i];
        }
        int ls = 0;
        
        for(int i =0;i<arr.length;i++)
        {	rs-=arr[i];
            if(ls==rs)
            {
                return i;
            }
         ls+=arr[i];
        }
        return -1;
	}
}
