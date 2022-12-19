
public class Solution {

	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		
    	int dp[][]=new int[n+1][maxWeight+1];
        for(int i =0;i<dp.length;i++)
        {
            for(int j = 0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        
        return knap(weights,values,n,maxWeight,dp);
	}
    
    public static int knap(int weights[],int values[],int n,int W,int dp[][])
    {
        if(n==0 || W==0)
        {
            return 0;
        }
        
        else if(dp[n][W]!=-1)
        {
            return dp[n][W];
        }
        else if(weights[n-1]<=W)
        {
            int a = values[n-1]+knap(weights,values,n-1,W-weights[n-1],dp);
            int b = knap(weights,values,n-1,W,dp);
            
            dp[n][W]=Math.max(a,b);
            return Math.max(a,b);
        }
        else
        {
            dp[n][W]=knap(weights,values,n-1,W,dp);
            return knap(weights,values,n-1,W,dp);
        }
    }

}
