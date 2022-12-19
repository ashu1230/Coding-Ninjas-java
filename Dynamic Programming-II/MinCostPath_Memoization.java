package dp;

public class MinCostPath_Memoization {

	public static int minCostPath(int[][] input) {
		
		int dp[][] = new int[input.length+1][input[0].length+1];
		for(int i =0;i<dp.length;i++)
		{
			for(int j =0;j<dp[0].length;j++)
			{
				dp[i][j]=Integer.MIN_VALUE;
			}
		}
		return minimum(input,0,0,dp);
	}
	
	public static int minimum(int[][] input,int i,int j,int dp[][])
	{
		
		//Time Complexity: O(m*n)
		int m= input.length;
		int n = input[0].length;
		
		if(i==m-1 && j==m-1)
		{
			return input[i][j];
		}
		if(i>=m || j>=n)
		{
			return Integer.MAX_VALUE;
		}
		
		int ans1,ans2,ans3;
		if(dp[i+1][j]==Integer.MIN_VALUE)
		{
			ans1=minimum(input,i+1,j,dp);
			dp[i+1][j]=ans1;
		}
		else
		{
			ans1=dp[i+1][j];
		}
		
		if(dp[i][j+1]==Integer.MIN_VALUE)
		{
			ans2=minimum(input,i,j+1,dp);
			dp[i][j+1]=ans2;
		}
		else
		{
			ans2=dp[i][j+1];
		}
		if(dp[i+1][j+1]==Integer.MIN_VALUE)
		{
			ans3=minimum(input,i+1,j+1,dp);
			dp[i+1][j+1]=ans3;
		}
		else
		{
			ans3=dp[i+1][j+1];
		}
		
		int ans = input[i][j]+ Math.min(ans1, Math.min(ans2, ans3));
		return ans;
	}

	public static void main(String[] args) {
		int arr[][] = {{5,7,2,4},{1,8,1,3},{6,2,9,5},{1,6,2,8}};
		System.out.println(minCostPath(arr));
	}

}
