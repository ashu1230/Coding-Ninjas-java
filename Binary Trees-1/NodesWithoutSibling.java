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

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		
        if(root == null)
        {
            return;
        }
        
        if(root.left==null && root.right!=null)
        {
            System.out.print(root.right.data+" ");
            
        }
        
        if(root.left!=null && root.right==null)
        {
            System.out.print(root.left.data+" ");
           
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
	}

}
