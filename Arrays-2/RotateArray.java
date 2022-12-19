
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int arry[]=new int[d];
        int i=0;
        while(i<d)
        {
            arry[i]=arr[i];
            i++;
        }
        i=0;
        while(i<arr.length-d)
        {
            arr[i]=arr[i+d];
                i++;
        }
        i=0;
        int k = arr.length-d;
        while(i<d)
        {
            arr[k]=arry[i];
            k++;
            i++;
        }
    }


}
