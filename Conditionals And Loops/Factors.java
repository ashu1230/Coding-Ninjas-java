import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        		int num;
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		int i=2;
		while(i<num)
		{
			if(num%i == 0)
			{
				System.out.print(i+" ");
				
			}
			i=i+1;
		}

	}

}

        
    
