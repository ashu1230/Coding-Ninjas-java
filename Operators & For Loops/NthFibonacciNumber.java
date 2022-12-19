import java.util.Scanner;
public class Solution {


 public static void main(String[] args) {
		 int n;
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        int a=0;
	        int b= 1;
	        
	        
	        for(int i = 1; i<=n;i++)
	        {
	        	int c =  a + b;
	            a=b;
	            b=c;
	        }
	        System.out.print(a);




	    }

	}
