package dp_av;

public class EqualSumPartition {

	public static boolean isPartition(int arr[])
	{
		int sum=0;
		for(int i =0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		if(sum%2!=0)
		{
			return false;
		}
		else 
		{
			return subset(arr,sum/2);
		}

	}
	
	public static boolean subset(int arr[],int sum)
	{
		int n = arr.length;
		boolean dp[][]=new boolean[n+1][sum+1];
		
		for(int i =0;i<dp.length;i++)
		{
			dp[i][0]=true;
		}
		for(int i =1;i<dp[0].length;i++)
		{
			dp[0][i]=false;
		}
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j=1;j<dp[0].length;j++)
			{
				if(arr[i-1]<=j)
				{
					dp[i][j]=(dp[i-1][j-arr[i-1]] || dp[i-1][j]);
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][sum];
	}

	public static void main(String[] args) {
		int arr[] = {1,5,3};
		boolean ans = isPartition(arr);
		System.out.println(ans);

	}

}
