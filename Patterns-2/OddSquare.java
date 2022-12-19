import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{
			int j = 1;
			int p = 2*i - 1;
			while(j<=n)
			{	
				System.out.print(p);
				p=p+2;
				j=j+1;
			
			if(p==(2*n+1))
			{
				p=1;
			}
			}
			System.out.println();
			i=i+1;
		}
	}
}
