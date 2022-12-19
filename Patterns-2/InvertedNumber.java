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
        int p=n;
        int i =1;
        while(i<=n)
        {
            int j = 1;
            while(j<=n-i+1)
            {
                
                System.out.print(p);
               j=j+1;
               
            }
              p = p-1;
            System.out.println();
            i=i+1;
        }

		
	}

}
