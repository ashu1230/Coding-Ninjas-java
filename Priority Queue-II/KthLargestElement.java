import java.util.*;
public class Solution {

    public static int kthLargest(int n, int[] input, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());


        for(int i =0;i<n;i++)
        {
            pq.add(input[i]);
        }

        while(!pq.isEmpty())
        {
            al.add(pq.peek());
            pq.poll();
        }
        
        return al.get(k-1);

        }
}
