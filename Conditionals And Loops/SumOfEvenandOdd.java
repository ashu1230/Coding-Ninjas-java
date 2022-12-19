import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
       int evensum=0;
		int oddsum=0;
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		
		while(n>0) {
		int dummynum = n %10;
		
		if(dummynum %2 == 0)
		{
			evensum=evensum + dummynum;
		}
		else
		{
			oddsum = oddsum+dummynum;
		}
		
		n=n/10;
		
		}
		System.out.println(evensum+" "+oddsum);
	}

}
