package dp_av;

public class LCS_Recursive {

	public static int lcsr(String x,String y,int n,int m)
	{
		if(n==0 || m==0)
		{
			return 0;
		}
		
		if(x.charAt(n-1)==y.charAt(m-1))
		{
			return 1+ lcsr(x, y, n-1, m-1);
		}
		else
		{
			int a = lcsr(x, y, n-1, m);
			int b = lcsr(x, y, n, m-1);
			return Math.max(a, b);
		}
	}

	public static void main(String[] args) {
		String x = "abcdgh";
		String y = "abedfha";

		int n = x.length();
		int m = y.length();
		int ans = lcsr(x, y,n,m);
		System.out.println(ans);

	}

}
