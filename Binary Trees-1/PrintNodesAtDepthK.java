package binarytress;

import java.util.Scanner;

public class PrintNodesAtDepthK {
	
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

	public static void printatK(BinaryTreeNode<Integer> root, int k)
	{
		if(root==null)
		{
			return;
		}
		if(k==0)
		{
			System.out.print(root.data+" ");
			return;
		}
		printatK(root.left,k-1);
		printatK(root.right,k-1);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput(true, 0,true);
		printatK(root, 2);

	}

}
