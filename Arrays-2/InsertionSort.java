
public class Solution {  

    public static void insertionSort(int[] arr) {
    
        int n =  arr.length;
        
        for(int i = 0;i<n;i++)
        {
            int j = i-1;
            int temp = arr[i];
           while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        insertionSort(arr);
    }
    

}
