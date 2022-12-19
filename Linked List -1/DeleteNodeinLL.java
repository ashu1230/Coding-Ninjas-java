public class Solution {

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		LinkedListNode<Integer> prev = head;
        if(pos==0)
        {
            LinkedListNode<Integer> cont = head.next;
            return cont;
        }
        else
        {
            int count = 0;
            while(count<pos-1 && prev!=null)
            {
            	count++;
            	prev=prev.next;
            }
            if(prev!=null && prev.next!=null)
            {
            	prev.next=prev.next.next;
            }
            
        }
        return head;
	}
}
