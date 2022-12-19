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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        if(root==null)
        {
            Pair<Integer, Integer> ans = new Pair<Integer, Integer>(0,0);
            return ans;
        }

        int max =   helpermax(root);
        int min =   helpermin(root);
         
        Pair<Integer, Integer> ans = new Pair<Integer, Integer>(min,max);
            
        return ans;
        
    }

    public static int helpermax(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;   
        }

        int base = root.data;
        int lrec = helpermax(root.left);
        int rrec = helpermax(root.right);

        if(lrec>base)
        {
            base = lrec;
        }
        if(rrec>base)
        {
            base=rrec;
        }
        return base;


    }

    public static int helpermin(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        int base = root.data;
        int lrec = helpermin(root.left);
        int rrec = helpermin(root.right);

        if (lrec < base) 
            base = lrec; 
        if (rrec < base) 
            base = rrec; 
        return base; 
    }

}
