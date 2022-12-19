public class Solution {

	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if(head==null || head.next == null)
        {
            return head;
        }
        
        LinkedListNode<Integer> shead = reverseLinkedListRec(head.next);
        LinkedListNode<Integer> tail = shead;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        tail.next=head;
        head.next=null;
        
        return shead;
	}

}
