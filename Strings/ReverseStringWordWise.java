public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
    String x="";
		int space=input.length();
		for(int i=input.length()-1;i>=0;i--) {
			
			if(i==0) {
				x=x+input.substring(0,space);
			}
			
			else if(input.charAt(i)==' ') {
				x=x+input.substring(i+1,space)+" ";
				space=i;
			}
		}
		return x;
		
	}
}
	

