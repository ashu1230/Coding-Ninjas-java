import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		
		n=sc.nextInt();
		int rev = 0;
		
		while(n>0)
		{
			int a = n%10;
			rev = rev*10+ a;
			n=n/10;
		}
		System.out.print(rev);
		
	}

}
