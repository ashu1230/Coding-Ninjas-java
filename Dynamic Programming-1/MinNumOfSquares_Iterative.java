package binarytress;

public class MinSquares_Iterative {
	
	public static int minsquares(int n)
	{
		
		int dp[]=new int[n+1];
		dp[0]=0;
		
		for(int i =1;i<=n;i++)
		{
			
			for(int j = 1;j*j<=i;j++)
			{
				int minAns=Integer.MAX_VALUE;
				int ans = dp[i-(j*j)];
				if(ans<minAns)
				{
					minAns=ans;
					dp[i]=1+minAns;
				}	
			}
			
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		System.out.println(minsquares(10));

	}

}
