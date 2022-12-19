package dp_av;

public class PalindromePartitioning_Memoization {

	public static int partition(String x)
	{
		int dp[][]=new int[1001][1001];
		for(int i =0;i<dp.length;i++)
		{
			for(int j = 0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
		return count(x,0,x.length()-1,dp);
	}

	public static int count(String x,int i,int j,int dp[][])
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
		if(palindrome(x, i, j)==true)
		{
			return 0;
		}
		else
		{
			for(int k =i;k<j;k++)
			{
				int tempans = count(x,i,k,dp)+count(x,k+1,j,dp) + 1;

				if(tempans<ans)
				{
					ans=tempans;
				}
			}
		}
		dp[i][j]=ans;
		return ans;
	}

	public static boolean palindrome(String x,int a,int b)
	{
		int i  = a;
		int j =b;
		boolean ans = true;
		while(i<j)
		{
			if(x.charAt(i)==x.charAt(j))
			{
				i++;j--;
			}
			else
			{
				ans = false;
				return ans;
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		String x = "ababbbabbababa";
		int ans = partition(x);
		System.out.println(ans);



	}

}
