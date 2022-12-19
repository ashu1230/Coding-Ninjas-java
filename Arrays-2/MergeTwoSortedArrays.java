
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int m = arr1.length;
        int n = arr2.length;
        
        int arr[] = new int[m+n];
        int i  = 0;
        int j  = 0;
        int k = 0;
        while(i<m && j<n)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k] = arr1[i];
                k++;
                i++;
            }
            else
            {
                arr[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<m)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }
    
    public static void main(String args[])
    {
        int arr1[]= {1,2,3,4,5,6,7,8};
        int arr2[] = {2,3,6,8,9};
        merge(arr1,arr2);
    }

}
