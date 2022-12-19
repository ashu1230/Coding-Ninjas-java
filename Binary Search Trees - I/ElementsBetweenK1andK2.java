public class Solution {

    /*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;

			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<=k2)
        {
            elementsInRangeK1K2(root.left,k1,k2);
            System.out.print(root.data+" ");
            elementsInRangeK1K2(root.right,k1,k2);
        }
        else  if(root.data<k1)
        {
            elementsInRangeK1K2(root.right,k1,k2);
        }
        else  if(root.data>k2)
        {
            elementsInRangeK1K2(root.left,k1,k2);
        }
    }


}
