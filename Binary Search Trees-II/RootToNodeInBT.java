package binarytress;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class RootToNodeInBT {
	
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
	
	public static ArrayList<Integer> RootToNode(BinaryTreeNode<Integer> root,int x)
	{
		if(root==null)
		{
			return null;
		}
		
		if(root.data==x)
		{
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput = RootToNode(root.left, x);
		if(leftOutput!=null)
		{
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOutput = RootToNode(root.right, x);
		{
			if(rightOutput!=null)
			{
				rightOutput.add(root.data);
				return rightOutput;
			}
		}
		
		return null;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		ArrayList<Integer> ans = RootToNode(root, 1);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}

}
