
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
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
				for(int k=j+1;k<n;k++)
				{
			
				if((arr[i]+arr[j]+arr[k])==x)
				{
					npair = npair+1;
					
				}
			}
		}
		}
		return npair;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int target = 12;
		int ans = findTriplet(arr,target);
		System.out.println(ans);

	}

}
