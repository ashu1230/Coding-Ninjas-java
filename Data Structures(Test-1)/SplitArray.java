
public class solution {

	public static boolean splitArray(int input[]) {
		
		return helper(input,0,input.length-1,0,0);
	}
	
	public static boolean helper(int[] arr,int si,int ei,int lsum,int rsum) {
		
		if(si>ei) {
			
			return lsum==rsum;
			
		}
		if(arr[si] % 5==0) {
			return helper(arr, si+1, ei, lsum + arr[si], rsum);
		}
		else if(arr[si] %3==0) {
			return helper(arr, si+1, ei, lsum, rsum+arr[si]);
		}
		else {
			return helper(arr, si+1, ei, lsum+arr[si], rsum) || helper(arr, si+1, ei, lsum, rsum+arr[si]);
		}
		
		
		
	}
}
