
public class Solution {  

  	public static void bubbleSort(int[] arr){
    	//Your code goes here
		int n = arr.length;
		
		for(int i = 0;i<n-1;i++)
		{
			for(int j = 0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
    }
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,13,4,1,3,6,28};
		bubbleSort(arr);

	}
}
