package dp_av;

public class MCM_Recursive {
	
	public static int mcmr(int arr[])
	{
		return solve(arr,1,arr.length-1);
	}
	
	
	
	public static int solve(int arr[],int i,int j)
	{
		if(i>=j)
		{
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for(int k = i;k<=j-1;k++)
		{
			int tempans = solve(arr,i,k) + solve(arr,k+1,j) + (arr[i-1] * arr[k] * arr[j]);
			if(tempans<ans)
			{
				ans = tempans;
			}
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		
		int arr[] = {40,20,30,10,30};
		
		int ans = mcmr(arr);
		System.out.println(ans);

	}

}
