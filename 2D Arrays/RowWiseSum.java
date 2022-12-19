import java.util.Scanner;
public class Solution {

	public static void rowWiseSum(int[][] mat) {
	  int row = mat.length;
        int col = mat[0].length;
        
        int sum=0;
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {	
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
            sum = 0;
        }
        
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		rowWiseSum(arr);

	}

}
