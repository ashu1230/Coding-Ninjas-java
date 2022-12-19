public class Solution {
    
    public static int length(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> OG=head;
		int n = length(head);
        for(int i =0;i<n-1;i++)
        {
            LinkedListNode<Integer> prev=null,curr=OG;
            for(int j =0;j<n-i-1;j++)
            {
                if(curr.data<=curr.next.data)
                {
                    prev=curr;
                    curr=curr.next;
                }
                else
                {
                    if(prev==null)
                    {
                        LinkedListNode<Integer> curr2=curr.next;
                        LinkedListNode<Integer> temp = curr2.next;
                        
                        curr2.next=curr;
                        curr.next=temp;
                        prev=curr2;
                        OG=curr2;
                    }
                    else
                    {
                        LinkedListNode<Integer> curr2= curr.next;
						LinkedListNode<Integer>  temp= curr2.next;
						prev.next=curr2;
						curr2.next=curr;
						curr.next=temp;
						prev= curr2;
                        
                    }
                }
            }
        }
        return OG;
	}
}
