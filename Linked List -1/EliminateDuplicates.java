public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
	LinkedListNode<Integer> temp = head;
		if(temp==null)
		{
			return null;
		}
		else if(temp.next==null)
		{
			return head;
		}
		while(temp!=null && temp.next!=null)
		{
			if((temp.data).equals(temp.next.data))
			{
				temp.next=temp.next.next;
			}
			else
			{
				temp=temp.next;
			}
					
		}
		
		return head;
	}

}
