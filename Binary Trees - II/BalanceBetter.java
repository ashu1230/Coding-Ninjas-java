package binarytress;

import java.util.Scanner;

public class BalanceBetter {
	
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

	public static BalancedTreeReturn balancebetter(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height=height;
			ans.isBalanced=isBal;
			return ans;
		}
		BalancedTreeReturn leftOutput = balancebetter(root.left);
		BalancedTreeReturn rightOutput = balancebetter(root.right);
		boolean isBal = true;
		
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1)
		{
			isBal = false;
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced)
		{
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height=height;
		ans.isBalanced = isBal;
		return ans;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput(true, 0, true);
		System.out.println("Is balanced : "+ balancebetter(root).isBalanced);

	}

}
