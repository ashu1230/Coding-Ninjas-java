public class solution {
	
	public static String[] permutationOfString(String input){
		if(input.length()==0)
        {
            String[] ans = {""};
            return ans;
        }
        
        String[] smallAns = permutationOfString(input.substring(1));
        String[] ans = new String[smallAns.length * input.length()];
        int k = 0;
        for(int i=0;i<smallAns.length;i++)
        {
            for(int j = 0;j<input.length();j++)
            {
                ans[k++]=smallAns[i].substring(0,j) + input.charAt(0)+ smallAns[i].substring(j); 
            }
        }
        return ans;
		
	}
	
}
