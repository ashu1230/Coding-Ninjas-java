
public class Solution {  

  	public static int pairSum(int arr[], int x) {
    	//Your code goes here
		int n = arr.length;
		//Arrays.sort(arr);
		int npair = 0;
		//System.out.println("X: "+x);
		
		//Printing sorted array
//		for(int i = 0;i<n;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		//checking for the pair
		
		for(int i =0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if((arr[i]+arr[j])==x)
				{
					npair = npair+1;
					
				}
			}
		}
		return npair;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,6,2,5,4,3,2,4};
		int target = 7;
		int ans = pairSum(arr,target);
		System.out.println(ans);

	}

}
