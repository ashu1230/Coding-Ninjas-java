package priorityqueue;

import java.util.*;

public class InbuiltPQ {
	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<k;i++)
        {
            pq.add(input[i]);
        }
        
        for(int i =k;i<n;i++)
        {
        	
        	if(pq.peek()>input[i])
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
		int arr[] = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		ArrayList<Integer> ans = kSmallest(arr.length,arr, 4);	
		System.out.println(ans);
	}

}
