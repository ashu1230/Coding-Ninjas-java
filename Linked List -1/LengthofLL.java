public class Solution {

    public static int length(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp = head;
        int count =0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
}
