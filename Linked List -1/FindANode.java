public class Solution {

    public static int findNode(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> pos = head;
        int count = 0;
        if(head==null)
        {
            return -1;
        }
       else if(pos.data==n)
        {
            return 0;
        }
       
            LinkedListNode<Integer> tail = head;


        while(tail!=null)
        {
            if(tail.data==n)
            {
                return count;
            }
            else
            {
                count++;
                tail = tail.next;
            }


        }

        return -1;
    }
}
