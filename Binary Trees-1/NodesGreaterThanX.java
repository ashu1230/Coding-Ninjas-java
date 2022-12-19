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

public class Solution {

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root==null)
        {
            return -1;
        }
        
       int count = (root.data>x)?1:0;
        if(root.left!=null)
        {
            count+=countNodesGreaterThanX(root.left,x);
        }
        if(root.right!=null)
        {
            count+=countNodesGreaterThanX(root.right,x);
        }
        return count;
	}

}
