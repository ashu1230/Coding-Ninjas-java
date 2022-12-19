package dp_av;

public class PalindromePartitioning_Recursive {

	public static int partition(String x)
	{
		return count(x,0,x.length()-1);
	}

	public static int count(String x,int i,int j)
	{
		if(i>=j)
		{
			return 0;
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
				int tempans = count(x,i,k)+count(x,k+1,j) + 1;

				if(tempans<ans)
				{
					ans=tempans;
				}
			}
		}
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
