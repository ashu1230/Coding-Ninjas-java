
public class Solution {

	public static String getCompressedString(String str) {
	String x="";
		x=x+str.charAt(0);
		int count=1;
		for(int i=1;i<=str.length();i++){

			if(i==str.length()) {
				if(count>1) {
					x=x+(char)(count+'0');
				}
				
			}

			else if(x.charAt(x.length()-1)==str.charAt(i)) {
				count++;
			}
			else {
				if(count>1) {
					x=x+(char)(count+'0');
				}
				x=x+str.charAt(i);
				count=1;
			}

		}
		return x;

	}

}
