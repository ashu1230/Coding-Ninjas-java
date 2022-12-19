import java.util.Scanner;
public class Solution {
    
    public static int[][] takeInput()
	{
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter R: ");
		int r = sc.nextInt();
		//System.out.println("Enter C: ");
		int c = sc.nextInt();
        
        if(r==0 & c==0)
        {
            System.out.println("row 0 -2147483648");
           
        }
		else if(r>0 && c>0){
		int arr[][]=new int[r][c];
		
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				//System.out.println("Enter "+i+"th row "+j+"th element");
				arr[i][j]=sc.nextInt();
			}
		}
        }
		return arr;
	}

	public static void findLargest(int mat[][]){
		//Your code goes here
        int maxc= Integer.MIN_VALUE;
        int ci = 0;
		
		int r = mat.length;
		int c = mat[0].length;
		
		for(int j=0;j<c;j++)
		{	int sum = 0;
			for(int i = 0;i<r;i++)
			{	
				sum+=mat[i][j];	
			}
			if(sum>maxc)
			{
				maxc = sum;
                ci = j;
				
			}
			
		}
		
        int maxr = Integer.MIN_VALUE;
        int ri = 0;
        for(int i = 0;i<r;i++)
        {	int sum = 0;
            for(int j = 0;j<c;j++)
            {
                sum+=mat[i][j];
            }
         	if(sum>maxr)
         	{
             maxr=sum;
             ri=i;
         	}
        }
        
        if(maxr>=maxc)
        {
            System.out.println("row "+ri+" "+maxr);
        }
        else
        {
            System.out.println("column "+ci+" "+maxc);
        }
	}

}
