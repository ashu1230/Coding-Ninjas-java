package binarytress;

import java.util.Scanner;

public class RemoveLeafNodes {
	
	public static BinaryTreeNode<Integer> takeInput(boolean isRoot,int parentData, boolean isLeft){
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
				System.out.println("Enter right node of "+parentData);
			}
		}
		Scanner sc = new Scanner(System.in);
		int nodeData = sc.nextInt();
		if(nodeData==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer> mainRoot = new BinaryTreeNode<>(nodeData);
		BinaryTreeNode<Integer> leftRoot = takeInput(false, nodeData, true);
		BinaryTreeNode<Integer> rightRoot = takeInput(false, nodeData, false);
		
		mainRoot.left=leftRoot;
		mainRoot.right=rightRoot;
		
		return mainRoot;
	}
	
	public static BinaryTreeNode<Integer> RemoveLeafNodes(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		if(root.left==null && root.right==null)
		{
			return null;
		}
		root.left=RemoveLeafNodes(root.left);
		root.right=RemoveLeafNodes(root.right);
		
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+": ");
		if(root.left!=null)
		{
			System.out.print("L"+root.left.data);
		}
		if(root.right!=null)
		{
			System.out.print(",R"+root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput(true, 0, true);
		BinaryTreeNode<Integer> ans = 	RemoveLeafNodes(root);
		print(ans);

	}

}
