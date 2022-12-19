package binarytress;

import java.util.Scanner;

public class IsBalanced {
	
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

	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		
		int leftHeight= height(root.left);
		int rightHeight = height(root.right);
		return 1+Math.max(leftHeight, rightHeight);
	}
	public static boolean isBalanced(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		if(Math.abs(leftHeight - rightHeight)>1)
		{
			return false;
		}
		
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		
		return isLeftBalanced && isRightBalanced;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput(true, 0, true);
		System.out.println("Is balanced: "+isBalanced(root));

	}

}
