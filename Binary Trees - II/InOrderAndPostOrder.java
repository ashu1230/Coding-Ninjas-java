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

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		
        return helper(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
	}
    
    public static BinaryTreeNode<Integer> helper(int[] po,int in[],int siPo,int eiPo, int siIn,int eiIn)
    {
        if(siIn>eiIn)
        {
            return null;
        }
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(po[eiPo]);
        
        int position = -1;
        for(int i =siIn;i<=eiIn;i++)
        {
            if(in[i]==root.data)
            {
                position=i;
                break;
            }
        }
        
        
        root.left= helper(po,in,siPo,siPo+(position-1-siIn),siIn,position-1);
        root.right = helper(po,in,siPo+(position-1-siIn)+1,eiPo-1,position+1,eiIn);
        
        return root;
        
    }

}
