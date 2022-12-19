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

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	   helper(root,0);
	}
    
    public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> root, int depth)
    {
        if(root==null)
        {
            return null;
        }
        
        root.data=depth;
        if(root.left!=null)
        {
            helper(root.left,depth+1);
        }
        if(root.right!=null)
        {
            helper(root.right,depth+1);
        }
        return root;
    }

}
