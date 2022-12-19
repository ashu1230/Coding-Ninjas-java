public class Solution {

	public static int minCount(int n) {
		int dp[]=new int[n+1];
        for(int i =0;i<dp.length;i++)
        {
            dp[i]=-1;
        }
        
        return count(n,dp);
	}
    
    public static int count(int n,int dp[])
    {
        if(n==0)
        {
            return 0;
        }
        
        int minans=Integer.MAX_VALUE;
        int ans;
        for(int i =1;i*i<=n;i++)
        {
            if(dp[n-(i*i)]==-1)
            {
                ans = count((n-(i*i)),dp);
                dp[n-(i*i)]=ans;
            }
            else
            {
                ans = dp[n-(i*i)];
            }
            
            if(ans<minans)
            {
                minans=ans;
            }
        }
        return 1 + minans;
    }

}
