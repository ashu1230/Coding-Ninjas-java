package dp_av;

public class PrintLongestCommonSubsequence {
	
	public static String printlcs(String x,String y)
	{
		int n = x.length();
		int m = y.length();
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j = 1;j<dp[0].length;j++)
			{
				if(x.charAt(i-1)==y.charAt(j-1))
				{
					dp[i][j]= 1+dp[i-1][j-1];
				}
				else
				{
					int a = dp[i-1][j];
					int b= dp[i][j-1];
					
					dp[i][j]=Math.max(a, b);
				}
			}
		}
		String ans ="";
		
		int i = n,j=m;
		
		while(i>0 && j>0)
		{
			if(x.charAt(i-1)==y.charAt(j-1))
			{
				ans+=x.charAt(i-1);
				i--;
				j--;
			}
			else
			{
				if(dp[i][j-1]>dp[i-1][j])
				{
					j--;
				}
				else
				{
					i--;
				}
			}
		}
		
		String ansfinal="";
		for(int k = ans.length()-1;k>=0;k--)
		{
			ansfinal+=ans.charAt(k);
		}
		
		return ansfinal;
	}

	public static void main(String[] args) {
		
		String x = "GeeksForGeeks";
		String y = "GeeksQuiz";
		
		String ans = printlcs(x,y);
		System.out.println(ans);
	}

}
