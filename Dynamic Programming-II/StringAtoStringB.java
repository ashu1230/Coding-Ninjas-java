package dp_av;

public class StringAtoStringB {
	
	public static void convert(String a,String b)
	{
		int n = a.length();
		int m = b.length();
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j =1;j<dp[0].length;j++)
			{
				if(a.charAt(i-1)==b.charAt(j-1))
				{
					dp[i][j]=1 + dp[i-1][j-1];
				}
				else
				{
					int x = dp[i-1][j];
					int y = dp[i][j-1];
					
					dp[i][j]=Math.max(x, y);
				}
			}
		}
		
		int deletion = n-dp[n][m];
		int insertion = m-dp[n][m];
		System.out.println("Deletion: "+deletion);
		System.out.println("Insertion: "+insertion);
	}

	public static void main(String[] args) {
		
		String a = "heap";
		String b = "pea";
		
		convert(a,b);
	}

}
