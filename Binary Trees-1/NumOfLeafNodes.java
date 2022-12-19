package binarytress;

import java.util.Scanner;

public class NumOfLeafNodes {
	
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
	
	public static int NumOfLeaves(BinaryTreeNode<Integer> root) {
		if(root==null)
		{
			return 0;
		}
		
		if(root.left==null && root.right==null)
		{
			return 1;
		}
		
		return NumOfLeaves(root.left) + NumOfLeaves(root.right);
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root  = takeInput(true, 0,true);
		System.out.println("Number of Leaf nodes: "+NumOfLeaves(root));

	}

}
