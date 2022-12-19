import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int n;
        int i = 1;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        
        while(i<=n)
        {
            int spaces = 1;
            while(spaces<=n-i)
            {
                System.out.print(' ');
                spaces = spaces + 1;
            }
            int numb = 1;
            while(numb<=i)
            {
                System.out.print('*');
                numb = numb + 1;
            }
            int dec = i - 1;
            while(dec>=1)
            {
                System.out.print('*');
                dec = dec - 1;
            }
            System.out.println();
            i = i +1;
        }	
	}
}
