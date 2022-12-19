import java.util.*;
public class solution {

	public static int maximumProfit(int budget[]) {
        if(budget.length==0)
		{
			return 0;
		}
		if(budget.length==1)
		{
			return budget[0];
		}
	int element = 0;
		int profit = 0;
		
		Arrays.sort(budget);
		for(int i =0;i<budget.length;i++)
		{	int max = 0;
			int count = 0;
			element = budget[i];
			count = budget.length-i;
			 max = count * element;
			if(profit<max)
			{
				profit = max;
			}
		}
		return profit;
	}
}
