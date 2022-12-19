public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    mergeSort(arr1);
        mergeSort(arr2);
//        for(int i =0;i<arr1.length;i++)
//        {
//        	System.out.print(arr1[i]+" ");
//        }
//        System.out.println();
//        for(int j = 0;j<arr2.length;j++)
//        {
//        	System.out.print(arr2[j]+" ");
//        }
       int i=0,j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
	}
    
    public static int[] mergeSort(int arr[])
    {
        if(arr.length<=1)
        {
            return arr;
        }
        
        int b[] = new int[arr.length/2];
        int c[] = new int[arr.length-b.length];
        
        for(int i =0;i<arr.length/2;i++)
        {
            b[i]=arr[i];
        }
        for(int i = arr.length/2;i<arr.length;i++)
        {
            c[i-arr.length/2]=arr[i];
        }
        mergeSort(b);
        mergeSort(c);
        int ans[] = merge(b,c,arr);
        return ans;
    }
    
    public static int[] merge(int s1[],int s2[], int d[])
    {
        int i=0,j=0,k=0;
        while(i<s1.length && j<s2.length)
        {
            if(s1[i]<=s2[j])
            {
                d[k]=s1[i];

                i++;
                k++;
            }
            else
            {
                d[k]=s2[j];

                j++;
                k++;
            }

        }
        if(i<s1.length)
        {
            while(i<s1.length)
            {
                d[k]=s1[i];
                i++;
                k++;
            }

        }
        if(j<s2.length)
        {
            while(j<s2.length)
            {
                d[k]=s2[j];

                j++;
                k++;
            }

        }
        return d;
    }
}

