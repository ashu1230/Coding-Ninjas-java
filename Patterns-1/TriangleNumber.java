import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int n;
        int i=1;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(i);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }

		
	}

}
