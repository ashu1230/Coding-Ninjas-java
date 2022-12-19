
public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        
        //the case when row = 0 and column = 0
        if(mat.length == 0){
            return;
        }
		int r = mat.length;
		int c = mat[0].length;
        
        if(r==0 && c==0)
        {
            System.out.print(" ");
            
        }
        else
        {
		
		for(int j=0;j<c;j++)
		{	
			
			if(j%2==0)
			{ 	int i=0;
				while(i<r)
				{
					System.out.print(mat[i][j]+" ");
					i++;
				}
			}
			else
			{
				int i = r-1;
				while(i>=0)
				{
					System.out.print(mat[i][j]+" ");
					i--;
				}
			}
			
        }
		}
	}
}
