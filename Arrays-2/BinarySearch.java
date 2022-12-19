
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int s = 0;
        int e = arr.length - 1;
        
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]>x)
            {
                e = mid - 1;
            }
            else if (arr[mid]<x)
            {
                s = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        System.out.println(binarySearch(arr,target));
    }

}
