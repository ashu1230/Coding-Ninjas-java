package binarytress;

import java.util.Scanner;

public class CheckBST {
	
	public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft)
	{
		if(isRoot)
		{
			System.out.println("Enter root data: ");
		}
		else
		{
			if(isLeft)
			{
				System.out.println("Enter left node of "+parentData);
			}
			else
			{
				System.out.println("Enter right node of "+ parentData);
			}
		}
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> left = takeInput(false, rootData, true);
		BinaryTreeNode<Integer> right = takeInput(false, rootData, false);
		
		root.left=left;
		root.right=right;
		
		return root;
	}

	public static boolean isBST(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		
		int leftMax = largest(root.left);
		if(leftMax>=root.data)
		{
			return false;
		}
		int rightMin = minimum(root.right);
		if(rightMin<root.data)
		{
			return false;
		}
		
		boolean left = isBST(root.left);
		boolean right = isBST(root.right);
		
		return left && right;
	}
	
	public static int largest(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		int left = largest(root.left);
		int right = largest(root.right);
		
		return Math.max(root.data, Math.max(left, right));
	}
	
	public static int minimum(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		int left = minimum(root.left);
		int right = minimum(root.right);
		
		return Math.min(root.data, Math.min(left, right));
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput(true, 0, true);
		System.out.print("Is it BST? "+ isBST(root));

	}

}
