package dp_av;

public class MCM_Recursive {

	public static int mcmr(int arr[])
	{
		int dp[][] = new int[1001][1001];
		for(int i =0;i<dp.length;i++)
		{
			for(int j = 0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
		return solve(arr,1,arr.length-1,dp);
	}



	public static int solve(int arr[],int i,int j,int dp[][])
	{
		if(i>=j)
		{
			return 0;
		}
		
		if(dp[i][j]!=-1)
		{
			return dp[i][j];
		}
		int ans = Integer.MAX_VALUE;
		for(int k = i;k<=j-1;k++)
		{
			int tempans = solve(arr,i,k,dp) + solve(arr,k+1,j,dp) + (arr[i-1] * arr[k] * arr[j]);
			if(tempans<ans)
			{
				ans = tempans;
			}
		}

		dp[i][j]=ans;
		return ans;
	}

	public static void main(String[] args) {

		int arr[] = {40,20,30,10,30};

		int ans = mcmr(arr);
		System.out.println(ans);

	}

}
