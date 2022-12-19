import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int sum = 0;
        int pv = 1;
        
        while(n>0)
        {
            int a = n%10;
            
            sum = sum + pv*a;
            n=n/10;
            pv=pv*2;
        }
        System.out.print(sum);
	}

}
