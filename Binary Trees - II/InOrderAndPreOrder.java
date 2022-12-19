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

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		BinaryTreeNode<Integer> root = helper(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
        return root;
	}
    
    public static BinaryTreeNode<Integer> helper(int[] pre, int[] in, int siPre,int eiPre, int siIn, int eiIn){
        if(siPre>eiPre)
        {
            return null;
        }
        int rootData = pre[siPre];
        BinaryTreeNode<Integer> rootmain = new BinaryTreeNode<Integer>(rootData);
        
        int rootIndex = -1;
        for(int i = siIn;i<=eiIn;i++)
        {
            if(in[i]==rootData)
            {
                rootIndex=i;
                break;
            }
        }
        int siPreLeft = siPre +1;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;
        int siInRight = rootIndex + 1;
        int eiPreRight= eiPre;
        int eiInRight = eiIn;
        
        int LeftSubTreeLength = eiInLeft - siInLeft + 1;
        int eiPreLeft = siPreLeft + LeftSubTreeLength-1;
        int siPreRight = eiPreLeft+1;
        
        BinaryTreeNode<Integer> left = helper(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
        BinaryTreeNode<Integer> right = helper(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
        
        rootmain.left=left;
        rootmain.right=right;
        
        return rootmain;
    }

}
