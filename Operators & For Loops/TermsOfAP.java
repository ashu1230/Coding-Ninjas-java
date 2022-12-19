import java.util.Scanner;
public class Main {

 	  public static void main(String[] args) {
	        // Write your code here
	        int n;
	        Scanner sc = new Scanner(System.in);
	        n=sc.nextInt();
	        
	        int i = 1;
	        while(i<=n)
	        {
	            int sum = 3*i + 2;
	            i+=1;
	            if(sum%4==0)
	            {
	                int skip = 1;
	                n = n + skip;
	                continue;
	            }
	            System.out.print(sum+" ");
	            
	        }

	    }
	}
