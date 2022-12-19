
public class Solution {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> oddH=null,oddT=null,evenH=null,evenT=null;
		LinkedListNode<Integer> temp = head;
		while(temp!=null)
		{
			if(temp.data%2==0)
			{
				if(evenH==null)
				{
					evenH=temp;
					evenT=temp;
				}
				else
				{
					evenT.next=temp;
					evenT=temp;
				}
			}
			else
			{
				if(oddH==null)
				{
					oddH=temp;
					oddT=temp;
				}
				else
				{
					oddT.next=temp;
					oddT=temp;
				}
			}
			temp=temp.next;
		}
		if(oddH==null)
		{
			return evenH;
		}
		if(evenH==null)
		{
			return oddH;
		}
		oddT.next=evenH;
		evenT.next=null;
		
		return oddH;
	}
}
