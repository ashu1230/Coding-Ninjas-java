package dp_av;

public class MinNoOfInsertionToMakePalindrome {
	
	public static int ninsertion(String x)
	{
		int n = x.length();
		String y = "";
		for(int i =n-1;i>=0;i--)
		{
			y+=x.charAt(i);
		}
		
		int dp[][]=new int[n+1][n+1];
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j = 1;j<dp[0].length;j++)
			{
				if(x.charAt(i-1)==y.charAt(j-1))
				{
					dp[i][j]=1 + dp[i-1][j-1];
				}
				else
				{
					int a = dp[i-1][j];
					int b = dp[i][j-1];
					
					dp[i][j]= Math.max(a, b);
				}
			}
		}
		
		return n - dp[n][n];
	}

	public static void main(String[] args) {
		String x = "abcda";
		
		int ans = ninsertion(x);
		System.out.println(ans);
		

	}

}
