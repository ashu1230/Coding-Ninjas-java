import java.util.ArrayList;

public class Solution {

    /*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if(root==null)
        {
            return null;
        }

        if(root.data==data)
        {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        if(data<root.data)
        {
            ArrayList<Integer> leftO = getPath(root.left,data);
            if(leftO!=null)
            {
                leftO.add(root.data);
                return leftO;
            }
        }
        else if(data>=root.data)
        {
            ArrayList<Integer> rightO = getPath(root.right,data);
            if(rightO!=null)
            {
                rightO.add(root.data);
                return rightO;
            }
        }

        
            return null;
    }
}
