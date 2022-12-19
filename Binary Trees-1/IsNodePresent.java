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

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x)
    {
        if(root==null)
        {
            return false;
        }
        boolean ans = false;
        if(root.data==x)
        {
            return true;
        }
        else
        {
            if(root.left!=null)
            {
                ans = isNodePresent(root.left, x);
                if(ans==true)
                {
                    return ans;
                }
            }
            if(root.right!=null)
            {
                ans = isNodePresent(root.right, x);
                if(ans==true)
                {
                    return ans;
                }
            }
        }
        return ans;
    }
}

// best solution:

/* public class Solution {

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x)
    {
        if(root==null)
        {
            return false;
        }
       
        if(root.data==x)
        {
            return true;
        }
        
        return (isNodePresent(root.left,x) || isNodePresent(root.right,x));
    }
} */
