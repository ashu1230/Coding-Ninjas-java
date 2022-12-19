package dp;

public class LootHouses {
	
	public static int maxMoneyLooted(int[] houses) {
		int n = houses.length;
		int dp[]=new int[n];
		
		dp[0]=houses[0];
		dp[1]=Math.max(houses[1], houses[0]);
		
		for(int i =2;i<n;i++)
		{
			dp[i]=Math.max(houses[i]+dp[i-2], dp[i-1]);
		}
		
		return dp[n-1];
		
		
	}

	public static void main(String[] args) {
		int houses[] = {5,5,10,100,10,5};
		int ans = maxMoneyLooted(houses);
		System.out.println(ans);

	}

}
