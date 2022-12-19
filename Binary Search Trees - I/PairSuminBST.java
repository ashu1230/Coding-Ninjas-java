import java.util.*;
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
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        ArrayList<Integer> list = new ArrayList<>();
		helper(root,list);
        
       int i = 0,j=list.size()-1;
        
        while(i<j)
        {
            if(list.get(i)+list.get(j)==s)
            {
                System.out.println(list.get(i)+" "+list.get(j));
                i++;j--;
            }
            else if(list.get(i)+list.get(j)<s)
            {
                i++;
                
            }
            else
            {
                j--;
            }
        }
	}
    
    
    public static void helper(BinaryTreeNode<Integer> root,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,list);
        list.add(root.data);
        helper(root.right,list);
    }
    

}
