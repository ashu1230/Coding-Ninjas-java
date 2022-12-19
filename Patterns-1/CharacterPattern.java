import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int n;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        while(i<=n)
        {
            int j = 1;
            int p=i;
            while(j<=i)
            {
                char jthChar = (char)('A'+p-1);
                    System.out.print(jthChar);
                j=j+1;
                p=p+1;
            }
            System.out.println();
            i = i +1;
        }

		
	}

}
