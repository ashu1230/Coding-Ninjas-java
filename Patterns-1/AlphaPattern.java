import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int i=1;
		while(i<=n)
		{	int p = i;
			int j = 1;
			while(j<=i)
			{
				char jthChar = (char)('A'+ p-1 );
				System.out.print(jthChar);
				j=j+1;
				
			}
			p=p+1;
			System.out.println();
			i=i+1;
		}


	}

}
