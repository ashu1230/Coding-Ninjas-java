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

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        if(arr.length==0)
        {
            return  null;
        }
        int mid;
        if(n%2!=0)
        {
            mid = n/2;
        }
        else
        {
            mid = (n/2) -1;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        int left[] = new int[mid];
        for(int i =0;i<mid;i++)
        {
            left[i]=arr[i];
        }

        int right[]=new int[arr.length-mid-1];
        for(int i =mid+1;i<arr.length;i++)
        {
            right[i-(mid+1)] = arr[i];
        }


        root.left=SortedArrayToBST(left, left.length);
        root.right=SortedArrayToBST(right, right.length);

        return root;
    }
}
