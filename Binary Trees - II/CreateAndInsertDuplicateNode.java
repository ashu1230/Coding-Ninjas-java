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

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if(root==null)
        {
            return;
        }

        BinaryTreeNode<Integer> dup = new BinaryTreeNode<Integer>(root.data);
        BinaryTreeNode<Integer> remaining = root.left;

        root.left=dup;
        dup.left=remaining;

        insertDuplicateNode(remaining);
        insertDuplicateNode(root.right);
    }

}
