/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/
import java.util.LinkedList;
import java.util.Queue;
public class Solution {

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if(root==null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            BinaryTreeNode<Integer> front = q.poll();
            
            if(front==null)
            {
                System.out.println();
                if(!q.isEmpty())
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(front.data+" ");
                if(front.left!=null)
                {
                    q.add(front.left);
                }
                if(front.right!=null)
                {
                    q.add(front.right);
                }
            }
        }
    }
}
