package binarytress;

import java.util.Scanner;

public class Largest {
	
	public static BinaryTreeNode<Integer> takeInput(boolean isRoot,int parentData, boolean isLeft){
		if(isRoot)
		{
			System.out.println("Enter root data: ");
		}
		else
		{
			if(isLeft)
			{
				System.out.println("Enter the leftNode of "+parentData);
			}
			else
			{
				System.out.println("Enter the rightNode of "+ parentData);
			}	
		}
		Scanner sc=new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer> mainRoot = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftNode = takeInput(false, rootData, true);
		BinaryTreeNode<Integer> rightNode = takeInput(false, rootData, false);

		mainRoot.left=leftNode;
		mainRoot.right=rightNode;

		return mainRoot;
	}
	
	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" : ");
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
	}

	public static int largest(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return -1;
		}
		int LargestLeft = largest(root.left);
		int LargestRight= largest(root.right);
		
		return Math.max(root.data, Math.max(LargestLeft, LargestRight));
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput(true, 0, true);
		System.out.println("largest root: "+largest(root));

	}

}
