
public class Solution {  

	  public static void selectionSort(int[] arr) {
	    	//Your code goes here
	        int n = arr.length;
	        
	        for(int i = 0;i<n-1;i++)
	        {
	        	int min = Integer.MAX_VALUE;
	        	int minindex = -1;
	            for(int j = i;j<n;j++)
	            {
	                if(arr[j]<min)
	                {
	                	min=arr[j];
	                	minindex = j;
	                
	                }
	            }
	            int temp = arr[minindex];
	            arr[minindex]=arr[i];
	            arr[i]=temp;
	        }
	       
	    }   

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,13,4,1,3,6,28};
		selectionSort(arr);

	}

}
