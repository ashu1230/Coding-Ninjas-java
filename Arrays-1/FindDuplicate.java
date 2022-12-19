
public class Solution{  
    
  public static int duplicateNumber(int[] arr){
		int n = arr.length;
		int dupe=0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {     
			for (int j = i+1; j < arr.length; j++) {     
				if(arr[i] > arr[j]) {    
					temp = arr[i];    
					arr[i] = arr[j];    
					arr[j] = temp;    
				}     
			}     
		}    

		for(int i =0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				dupe=dupe+ arr[i];
			}
		}

		return dupe;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,7,2,5,4,7,1,3,6};  // sorting output:  0 1 2 3 4 5 6 7 7 
			System.out.println(duplicateNumber(arr));

	}

}
