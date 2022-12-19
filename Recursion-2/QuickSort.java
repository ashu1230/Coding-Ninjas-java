public class Solution {
	
	public static void quickSort(int[] input) {
		int s = 0;
     int e = input.length-1;
		quickS(input,s,e);
	}
    
    public static void quickS(int[] input, int si, int ei)
    {	
        if(si>=ei)
        {
            return;
        }
        int pivotIndex = partition(input,si,ei);
        quickS(input,pivotIndex+1,ei);
        quickS(input,si,pivotIndex-1);
        
    }
    
    public static int partition(int a[],int si,int ei)
    {
        int pivotElement = a[si];
        int smallnumcount = 0;
        
        for(int i = si+1;i<=ei;i++)
        {
            if(a[i]<pivotElement)
            {
                smallnumcount++;
            }
        }
        int temp = a[si + smallnumcount];
        a[si+smallnumcount]= pivotElement;
        a[si]=temp;
        
        int i = si;
        int j  = ei;
        while(i<j)
        {
            if(a[i]<pivotElement)
            {
                i++;
            }
            else if(a[j]>= pivotElement)
            {
                j--;
            }
            else
            {
                temp = a[i];
                a[i]=a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return si + smallnumcount;
    }
	
}
