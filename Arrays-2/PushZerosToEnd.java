public class Solution {  

   
		public static void pushZerosAtEnd(int[] arr) {
		//Your code goes here
		// int n = arr.length;
		// int k = 0;
		// int arr1[] = new int[n];
		// for(int i = 0;i<n;i++)
		// {
		// System.out.print(arr[i]+" ");
		// 	if(arr[i]!=0)
		// 	{
		// System.out.print("In if");
		// 		arr1[k]=arr[i];
		// 		k++;
		// 	}
		// System.out.println();
		// }
		// arr=arr1;
            int n=arr.length;
            int count = 0;  
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i];
        while (count < n) 
            arr[count++] = 0; 
		}
      


}
