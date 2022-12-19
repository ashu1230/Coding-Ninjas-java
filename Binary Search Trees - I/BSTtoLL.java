
import java.util.*;
public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		ArrayList<Integer> list = new ArrayList<>();
        
        helper(root,list);
        
        Collections.sort(list);
        
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        int i=0;
        while(i<list.size())
        {
            LinkedListNode<Integer> cn = new LinkedListNode<Integer>(list.get(i));
            
            if(head==null)
            {
                head=cn;
                tail = cn;
            }
            else
            {
                tail.next=cn;
                tail=tail.next;
            }
            i++;
        }
        return head;
	}
    
    public static void helper(BinaryTreeNode<Integer> root, ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        
        list.add(root.data);
        helper(root.left,list);
        helper(root.right,list);
        
        
    }
}
