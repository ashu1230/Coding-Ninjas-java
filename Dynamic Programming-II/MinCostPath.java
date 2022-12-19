package dp;

public class MinCostPath {
	
public static int minCostPath(int[][] input) {
		
        return minimum(input,0,0);
	}
    
    public static int minimum(int[][] input,int i,int j)
    {
        int m = input.length;
        int n = input[0].length;
        
       if(i==m-1 && j==n-1)
       {
    	   return input[i][j];
       }
       
       if(i>=m || j>=n)
       {
    	   return Integer.MAX_VALUE;
       }
        
        int down = minimum(input,i+1,j);
        int left = minimum(input,i,j+1);
        int diag = minimum(input,i+1,j+1);
        
        int mincost = input[i][j]+Math.min(down, Math.min(left, diag));
        
        return mincost;
    }

	public static void main(String[] args) {
		int arr[][] = {{5,7,2,4},{1,8,1,3},{6,2,9,5},{1,6,2,8}};
		System.out.println(minCostPath(arr));

	}

}
