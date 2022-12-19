import java.util.*;

public class Solution {
    /*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
    /*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        return helper(root);
    }

    public static ArrayList<LinkedListNode<Integer>> helper(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return null;
        }

        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<LinkedListNode<Integer>> ans= new ArrayList<LinkedListNode<Integer>>();
        LinkedListNode<Integer> head= null;
        LinkedListNode<Integer> tail = null;

        while(!q.isEmpty())
        {
            BinaryTreeNode<Integer> front = q.poll();
            

            if(front==null)
            {
                ans.add(head);
				head=null;
                tail = null;
                
                if(!q.isEmpty())
                {
                    q.add(null);
                }
                
            }
            else
            {
                
                LinkedListNode<Integer> cn = new LinkedListNode<>(front.data);
                if(front.left!=null)
                {
                    q.add(front.left);
                }
                if(front.right!=null)
                {
                    q.add(front.right);
                }
                if(head==null)
                {
                    head=cn;
                    tail=cn;
                }
                else
                {
                    tail.next=cn;
                    tail=tail.next;
                }
            }
        }
        return ans;
    }

}
