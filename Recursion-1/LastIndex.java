public class Solution {

	public static int lastIndex(int input[], int x) {
        int endI = input.length-1;
        
        return helper(input,x,endI);
        
		
	}
    
    public static int helper(int input[],int x,int endI){
        if(endI==0)
        {
            return -1;
        }
        
        if(input[endI]==x)
        {
            return endI;
        }
        
        return helper(input,x,endI-1);
    }
	
}
