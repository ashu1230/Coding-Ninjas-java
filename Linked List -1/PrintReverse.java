public class Solution {

	public static void printReverse(LinkedListNode<Integer> root) {
		LinkedListNode<Integer> temp = root;
        if(root==null)
        {
            return;
        }
        printReverse(root.next);
        System.out.print(root.data+" ");
	}

}
