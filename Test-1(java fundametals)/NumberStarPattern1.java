import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
		int n;
        Scanner sc = new Scanner(System.in);
    	n=sc.nextInt();
        
        int i = 1;
        while(i<=n)
        {
        	int j = 1;
        	while(j<=n)
        	{
        		if(n-j+1==i)
        		{
        			System.out.print('*');
        		}
        		else
        		{
        			System.out.print(n-j+1);
        		}
        		j+=1;
        		
        	}
        	i+=1;
    		System.out.println();
        }
        
	}
}
