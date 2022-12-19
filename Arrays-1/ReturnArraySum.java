import java.util.Scanner;
public class Solution {
	
	public static int sum(int[] arr) {
		//Your code goes here
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        return sum;
	}
    public static void main(String args[])
    {
        int[] arr= {1,2,3,4,7,8};
		System.out.println(sum(arr));
    }
}
