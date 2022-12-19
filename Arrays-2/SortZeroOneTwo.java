import java.util.*;
public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
	{
		int c0 = 0,c1= 0,c2 = 0;
		int n = arr.length;
		
		for(int i = 0;i<n;i++)
		{
			if(arr[i]==0)
			{
				c0++;
			}
			else if(arr[i]==1)
			{
				c1++;
			}
			else
			{
				c2++;
			}
		}
        int n1[] = new int[n];
		for(int i = 0;i<c0;i++)
		{
			n1[i]+= 0;
			
		}
		for(int i = c0;i<c1+c0;i++)
		{
			n1[i]+=1;
			
		}
		for(int i = c0;i<n;i++)
		{
			if(n1[i]==0)
            {
                n1[i]+=2;
            }
		}}}}
