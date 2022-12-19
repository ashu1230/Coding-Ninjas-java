package dp_av;

public class PrintShortestCommonSupersequence {
	
	public static String printss(String x,String y)
	{
		int n = x.length();
		int m = y.length();
		
		int dp[][]=new int[n+1][m+1];
		String ans="";
		
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
		
		int i = n,j=m;
		
		while(i>0 && j > 0)
		{
			if(x.charAt(i-1)==y.charAt(j-1))
			{
				ans+=x.charAt(i-1);
				i--;
				j--;
			}
			else
			{
				if(dp[i-1][j]>dp[i][j-1])
				{
					ans+=x.charAt(i-1);
					i--;
				}
				else
				{
					ans+=y.charAt(j-1);
					j--;
				}
			}
		}
		
		while(i>0)
		{
			ans+=x.charAt(i-1);
			i--;
		}
		while(j>0)
		{
			ans+=y.charAt(j-1);
			j--;
		}
		
		String ansfinal="";
		
		for(int l = ans.length()-1;l>=0;l--)
		{
			ansfinal+=ans.charAt(l);
		}
		
		return ansfinal;
	}

	public static void main(String[] args) {
		String x = "AGGTAB";
		String y = "GXTXAYB";
		
		String ans = printss(x,y);
		System.out.println(ans);

	}

}
