
public class Solution {  

    public static void rotate(int[] arr, int d) {
        int small[] = new int[d];
        for(int i =0;i<d;i++)
        {
            small[i] = arr[i];
        }// 2 6 

        int i = 0,j=arr.length-1;
        while(i<j)
        {
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;

            i++;
            j--;
        }// 8 9 5 1 3 6 2

        int a = 0,b = arr.length-d-1;
        while(a<b)
        {
            int temp = arr[b];
            arr[b]=arr[a];
            arr[a]=temp;
            a++;
            b--;
        }

        int y = arr.length-d,z=arr.length-1;
        while(y<z)
        {
            int temp = arr[z];
            arr[z]=arr[y];
            arr[y]=temp;
            y++;
            z--;
        }

    }
}
