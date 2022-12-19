public class Solution {


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    
		if(head==null)
		{
			return head;
		}

		if(pos==0)
		{
			return head.next;
		}
		else
		{
			head.next = deleteNodeRec(head.next,pos-1);
			
			return head;
		}
	}
}
