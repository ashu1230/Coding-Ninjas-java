import java.util.Scanner;
public class Main {
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int n =sc.nextInt();
			
			int i=0;
            int sq = 0;
			while(i*i<=n)
			{
				sq = i;
				i+=1;
			}
            System.out.print(sq);
			
		}

	}
