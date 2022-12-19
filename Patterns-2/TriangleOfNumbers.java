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
            int spaces = 1;
            int p =i;
            while(spaces<=n-i)
            {
                System.out.print(' ');
                spaces = spaces + 1;
                
            }
            int numb = 1;
            
            while(numb<=i)
            {
                System.out.print(p);
                numb = numb + 1;
                p=p+1;
            }
            int dec = p -2;
            while(dec>=i)
            {
                System.out.print(dec);
                dec= dec - 1;
            }
            System.out.println();
            i = i +1;
        }
	}
}
