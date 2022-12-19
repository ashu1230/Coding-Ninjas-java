public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		LinkedListNode<Integer> temp = head;
        int count = 0;
        if(temp==null)
        {
           return;
        }
        while(temp!=null)
        {	
            if(count==i)
            {
                System.out.println(temp.data);
            }
            count++;
            temp=temp.next;
        }
        
    }
}
