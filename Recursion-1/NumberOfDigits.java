public class Solution {

	public static int count(int n){
		if(n/10 == 0){
			return 1;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}

}
