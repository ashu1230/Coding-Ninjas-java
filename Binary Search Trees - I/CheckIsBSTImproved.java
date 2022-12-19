package binarytress;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsBST {
	
	public static BinaryTreeNode<Integer> takeInput()
	{
		System.out.println("Enter the root data: ");
		Scanner sc = new Scanner(System.in);
		int rootData= sc.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			BinaryTreeNode<Integer> front = q.poll();
			System.out.println("Enter the left node of "+front.data);
			int left = sc.nextInt();
			if(left!=-1)
			{
				BinaryTreeNode<Integer> leftC = new BinaryTreeNode<Integer>(left);
				front.left=leftC;
				q.add(leftC);
			}
			System.out.println("Enter the right node of "+front.data);
			int right  = sc.nextInt();
			if(right!=-1)
			{
				BinaryTreeNode<Integer> rightC = new BinaryTreeNode<Integer>(right);
				front.right=rightC;
				q.add(rightC);
			}
		}
		return root;
	}
	
	public static IsBSTReturn isBST(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
			return ans;
		}
		IsBSTReturn leftAns = isBST(root.left);
		IsBSTReturn rightAns = isBST(root.right);
		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data,Math.max(leftAns.max,rightAns.max));
		
		boolean isBST=true;
		if(leftAns.max>=root.data)
		{
			isBST=false;
		}
		if(rightAns.min<root.data)
		{
			isBST = false;
		}
		if(!leftAns.isBST)
		{
			isBST=false;
		}
		if(!rightAns.isBST)
		{
			isBST=false;
		}
		
		IsBSTReturn ans = new IsBSTReturn(min,max,isBST);
		return ans;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		IsBSTReturn ans = isBST(root);
		System.out.println(ans.min+" "+ans.max+" "+ans.isBST);

	}

}
