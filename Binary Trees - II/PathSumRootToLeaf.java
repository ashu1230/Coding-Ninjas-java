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
import java.util.*;
public class Solution {

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        ArrayList<Integer> path = new ArrayList<>();

        helper(root,path,k);


    }

    public static void helper(BinaryTreeNode<Integer> root, ArrayList<Integer> path, int k)
    {
        if(root==null)
        {
            return;
        }

        k=k-root.data;
        path.add(root.data);// 2 3 4 4
        if(root.left==null && root.right==null)
        {
            if(k==0)
            {
                for(int i=0;i<path.size();i++)
                {
                    System.out.print(path.get(i)+" ");
                }
                System.out.println();
            }
            path.remove(path.size()-1);
            return;
        }
        helper(root.left,path,k);
        helper(root.right,path,k);
        path.remove(path.size()-1);
    }



}
