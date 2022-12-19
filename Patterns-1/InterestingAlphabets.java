import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
    int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{
			int j = 1;
			int p = i;
			while(j<=i)
			{
				char jthChar = (char)('A'+ n-p);
				System.out.print(jthChar);
				j=j+1;
				p=p-1;
			}
			
			System.out.println();
			i=i+1;
		}
	}
}
