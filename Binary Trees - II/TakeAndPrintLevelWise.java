package binarytress;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class TakeAndPrintLevelWise {
	
	public static BinaryTreeNode<Integer> takeInputLevelWise()
	{
		System.out.println("Enter root node: ");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData == -1 )
		{
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pending = new LinkedList<>();
		pending.add(root);
		
		while(!pending.isEmpty())
		{
			BinaryTreeNode<Integer> front = pending.poll();
			
			System.out.println("Enter the left node of: "+front.data);
			int left=sc.nextInt();
			
			if(left!=-1)
			{
				BinaryTreeNode<Integer> leftC = new BinaryTreeNode<Integer>(left);
				front.left=leftC;
				pending.add(leftC);
			}
			
			System.out.println("Enter the right node of: "+front.data);
			int right=sc.nextInt();
			
			if(right!=-1)
			{
				BinaryTreeNode<Integer> rightC = new BinaryTreeNode<Integer>(right);
				front.right=rightC;
				pending.add(rightC);
			}
		}
		return root;
	}

	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Queue<BinaryTreeNode<Integer>> pending = new LinkedList<>();
		pending.add(root);
		
		while(!pending.isEmpty())
		{
			BinaryTreeNode<Integer> front = pending.poll();
			System.out.print(front.data+":");
			if(front.left!=null)
			{
				System.out.print("L"+":"+front.left.data+",");
				pending.add(front.left);
			}
			
			else if(front.left==null){
				System.out.print("L"+":"+"-1"+",");
			}
			if(front.right!=null)
			{
				System.out.print("R"+":"+front.right.data);
				pending.add(front.right);
			}
			
			else if(front.right==null){
				System.out.print("R"+":"+"-1");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		print(root);

	}

}
