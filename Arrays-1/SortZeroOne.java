public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        int temp = 0;
	for(int i = 0;i<n;i++)
	{
		for(int j = i+1;j<n;j++)
		{
			
		if(arr[i]>arr[j])
		{
			temp = arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		}
	}
        
    }
    
    public static void main(String args[])
    {
        int arr[] = {0,1,1,0,1,0,1};
        sortZeroesAndOne(arr);
    }
}
