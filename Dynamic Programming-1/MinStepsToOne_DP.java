public class Solution {

	public static int countMinStepsToOne(int n) {
		
        if(n<=1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        if(n==3)
        {
            return 1;
        }
        
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=0;
        
        for(int i =2;i<=n;i++)
        {
            int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
            ans1=dp[i-1];
            
            if(i%2==0)
            {
                ans2=dp[i/2];
            }
            if(i%3==0)
            {
                ans3=dp[i/3];
            }
            
            dp[i]=1+ Math.min(ans1,Math.min(ans2,ans3));
        }
        
        return dp[n];
	}

}
