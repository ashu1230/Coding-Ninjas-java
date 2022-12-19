import java.util.Scanner;
import java.util.Arrays;
public class Solution {


	public static void totalSum(int[][] mat) {
		//Your code goes here
        int r = mat.length;
		int c = mat[0].length;

		int all[] = new int[40]; //arraylist
		int sum = 0;
		int k =0;
		//row boundaries
		for(int i = 0;i<1;i++)
		{
			for(int j = 0;j<c;j++)
			{

				all[k]=mat[i][j];
				k++;
			}
		}

		for(int i = r-1;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{

				all[k]=mat[i][j];
				k++;
			}
		}
		//column boundaries
		for(int j=0;j<1;j++)
		{
			for(int i = 0; i<r;i++)
			{
				all[k]=mat[i][j];
				k++;
			}
		}

		for(int j=c-1;j<c;j++)
		{
			for(int i = 0; i<r;i++)
			{
				all[k]=mat[i][j];
				k++;
			}
		}
		//diagonals 
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				if(i==j)
				{
					all[k]=mat[i][j];
					k++;
				}
			}
		}

		for(int j = c-1;j>=0;j--)
		{
			all[k]=mat[r-j-1][j];
			k++;
		}
		//removing duplicates from array
		Arrays.sort(all);

//		for(int i = 0;i<all.length;i++)
//		{
//			System.out.print(all[i]+" ");
//		}
		int n = all.length;
		int zeroi = 0;

		for(int i = 0;i<n;i++)
		{
			if(all[i]!=0)
			{	
				zeroi=i;
				break;
			}
		}
		//System.out.println(zeroi);

		sum=all[zeroi];
		for(int i=zeroi+1;i<n;i++){
			if(all[i]==all[i-1]){
				continue;
			}
			else
			{
				sum+=all[i];
			}

		}
		System.out.println(sum);


	}
        
	}

