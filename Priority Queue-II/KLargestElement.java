package priorityqueue;

import java.util.*;

public class InbuiltPQ {
	public static ArrayList<Integer> kLargest(int input[], int k) {
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0;i<k;i++)
		{
			pq.add(input[i]);
		}
		
		for(int i =k;i<input.length;i++)
		{
			if(pq.peek()<input[i])
			{
				pq.poll();
				pq.add(input[i]);
			}
		}
		while(!pq.isEmpty())
		{
			ans.add(pq.peek());
			pq.poll();
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {4,3,7,6,9,10,1,2};
		ArrayList<Integer> ans = kLargest(arr, 4);	
		System.out.println(ans);
	}

}
