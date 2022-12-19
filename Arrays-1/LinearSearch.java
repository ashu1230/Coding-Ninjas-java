
public class Solution {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        int searchnum=0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
               return i;
            }
            
        }
        return -1;
        
    }
    
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        
        int x = 5;
        System.out.println(linearSearch(arr,x));
}
}
