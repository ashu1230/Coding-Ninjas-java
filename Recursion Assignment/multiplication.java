public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		if(m==0||n==0)
		{
			return 0;
		}
		
		if(m==1)
		{
			return n;
		}
		int fi = multiplyTwoIntegers(m-1,n);
		int ans = fi+n;
		return ans;
		
		

	
	}
}
