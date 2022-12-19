
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int n = arr.length;
		for(int i = 0;i<n-1;i+=2)
		{
			
				int b = arr[i];
				arr[i]=arr[i+1];
				arr[i+1] = b;
			
		}
    }
    
    public static void PrintArray(int arr[])
    {
        int n = arr.length;
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
		
    
		public static void main(String args[])
        {
            int array[] = {1,2,3,4,5,6};
            swapAlternate(array);
            PrintArray(array);
        }
		
	
    
}
    
