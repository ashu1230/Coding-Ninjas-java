public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root==null)
        {
            return false;
        }
        
        if(root.data==k)
        {
            return true;
        }
       
       else if(k<root.data)
        {
            return searchInBST(root.left,k);
        }
        else
        {
            return searchInBST(root.right,k);
        }
      
	}
}
