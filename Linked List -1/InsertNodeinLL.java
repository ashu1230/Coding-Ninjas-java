public class Solution {

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		LinkedListNode<Integer> target = new LinkedListNode<>(data);
        if(pos==0)
        {
            target.next = head;
            return target;
        }
        else
        {
            int count = 0;
            LinkedListNode<Integer> prev = head;
            while(count<pos - 1 && prev!=null)
            {
                count++;
                prev=prev.next;
            }
            if(prev!=null)
            {
                target.next=prev.next;
                prev.next=target;
            }
            return head;
        }
	}
}
