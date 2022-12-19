public class Solution {

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
      
        if(i==j)
        {
            return head;
        }
        if(i>j)
        {
            int t = i;
            i=j;
            j=t;
        }


        LinkedListNode<Integer> p1=null,p2=null,n1=null,n2=null;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> tail = null;
        int count = 0;
        while(temp!=null)
        {
            if(count==i)
            {

                p1= tail;
                n1=temp;
            }
            else if(count==j)
            {
                p2=tail;
                n2=temp;
            }
            tail=temp;
            temp=temp.next;
            count++;

        }
        if(p1==null)
        {
            head=n2;
        }
        else
        {
            p1.next=n2;
            p2.next=n1;

        }
        
        LinkedListNode<Integer> nextelem = n2.next;
        n2.next=n1.next;
        n1.next=nextelem;
        
       

            return head;
    }

}
