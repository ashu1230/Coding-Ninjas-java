package dp;
import java.util.HashMap;

public class ByteLandian {

	public static long bytelandian(long n, HashMap<Long, Long> memo) {
		if(n<=1)
		{
			return n;
		}
		
		

		long ans2=Integer.MIN_VALUE;
		
			if(!memo.containsKey(n/2)) {
				ans2=bytelandian(n/2, memo);
				
			}
			else
			{
				ans2= memo.get(n/2);
			}
		
		long ans3=Integer.MIN_VALUE;
		
			if(!memo.containsKey(n/3)) {
				ans3=bytelandian(n/3, memo);
				
			}
			else
			{
				ans3= memo.get(n/3);
			}
		
		
		long ans4=Integer.MIN_VALUE;
		
			if(!memo.containsKey(n/4)) {
				ans4=bytelandian(n/4, memo);
				
			}
			else
			{
				ans4= memo.get(n/4);
			}
		
			long sum = ans2+ans3+ans4;
			long var = Math.max(n, sum);
			memo.put(n, var);
			
			return memo.get(n);
	}


		public static void main(String[] args) {
			HashMap<Long,Long> map = new HashMap<>();
			long ans = bytelandian(12,map);
			System.out.println(ans);

		}

	}
