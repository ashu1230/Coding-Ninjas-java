
public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        
        if(matrix.length == 0)
        {
            return;
        }
		int rs = 0;
		int re = matrix.length-1;
		int cs = 0;
		int ce = matrix[0].length - 1;
		int n = matrix.length;
		int m = matrix[0].length;
		int count = 1;
		
		while(count<=(n*m))
		{
			int i = rs;
			int j = cs;
			while(j<=ce)
			{
				System.out.print(matrix[rs][j]+" "); //1 2 3 4 
				j++;
				count++;
			}
			rs++;
			i++;
			while(i<=re)
			{
				System.out.print(matrix[i][ce]+" "); // 1 2 3 4 5 6 7 8
				i++;
				count++;
				
			}
			ce--;
			int k = ce;
			while(k>=cs)
			{
				System.out.print(matrix[re][k]+" ");// 1 2 3 4 5 6 7 8 9 10 11
				k--;
				count++;
			}
			
			re--;
			int l = re;
			while(l>=rs)
			{
				System.out.print(matrix[l][cs]+" "); // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 
				l--;
				count++;
			}
			cs++;
			
		}
    }
}
		
		
		
