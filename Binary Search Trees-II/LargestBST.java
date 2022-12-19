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

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        if(isBST(root))
        {
            return height(root);
        }

        int leftHeight = largestBSTSubtree(root.left);
        int rightHeight = largestBSTSubtree(root.right);
        return Math.max(leftHeight,rightHeight);
    }

    public static boolean isBST(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return true;
        }

        int leftMax = largest(root.left);
        if(leftMax>=root.data)
        {
            return false;
        }
        int rightMin = minimum(root.right);
        if(rightMin<root.data)
        {
            return false;
        }

        boolean left = isBST(root.left);
        boolean right = isBST(root.right);

        return left && right;
    }

    public static int largest(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int left = largest(root.left);
        int right = largest(root.right);

        return Math.max(root.data, Math.max(left, right));
    }

    public static int minimum(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        int left = minimum(root.left);
        int right = minimum(root.right);

        return Math.min(root.data, Math.min(left, right));
    }

    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        int LeftHeight = height(root.left);
        int RightHeight = height(root.right);

        return 1 + Math.max(LeftHeight,RightHeight);
    }
}

