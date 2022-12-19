public class Solution {

    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        if(head==null)
        {
            return null;

        }
        if(M==0)
        {
            return null;
        }
        if(N==0)
        {
            return head;
        }

        LinkedListNode<Integer> mhead=head;
        LinkedListNode<Integer> t1=head,t2=head;

        while(head!=null)
        {
            t1=head;
            for(int i =1;i<M && t1!=null; i++)
            {
                t1=t1.next;
            }
            if(t1!=null)
            {
                t2=t1.next;
            }
            for(int i = 1;i<N && t2!=null;i++)
            {
                t2=t2.next;
            }
            if(t2!=null)
            {
                t2=t2.next;
            }
            if(t1!=null)
            {
                t1.next=t2;
            }
            head=t2;
        }
        return mhead;
    }
}
