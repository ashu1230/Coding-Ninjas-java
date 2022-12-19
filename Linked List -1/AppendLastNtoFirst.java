public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
	int totalelements = 0;
		LinkedListNode<Integer> count =head;
        if(head==null)
        {
            return null;
        }
       	if(n==0)
        {
            return count;
        }
		while(count!=null)
		{
			totalelements++;
			count=count.next;
		}
		int sub = totalelements-n; //5-3=2 
		LinkedListNode<Integer> nh = head;
		int c=0;
		while(c<sub)
		{
			c++;
			nh=nh.next;
		}
		LinkedListNode<Integer> newhead = nh;
		
		LinkedListNode<Integer> prev = newhead;
		while(prev.next!=null)
		{
			prev=prev.next;
		}
		prev.next = head;
		
		LinkedListNode<Integer> br = head;
		int co = 0;
		while(co<sub-1)
		{
			co++;
			br = br.next;
		}
		br.next=null;
		
		return newhead;
		
	}
}
