public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		
        if(root==null)
        {
            return -1;
        }
        
        if(a<root.data && b<root.data)
        {
            return getLCA(root.left,a,b);
        }
        if(a>root.data && b>root.data)
        {
            return getLCA(root.right,a,b);
        }
        return root.data;
	}
}
