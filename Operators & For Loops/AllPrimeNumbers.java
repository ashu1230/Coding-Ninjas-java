import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for(int i =2;i<=n;i++)
		{ 
			if(i!=2 && i%2==0)
			{
				continue;
			}
			else if(i!=3 && i%3==0)
			{
				continue;
			}
			else if(i!=5 && i%5==0)
			{
				continue;
			}
			else if(i!=7 && i%7==0)
			{
				continue;
			}
			else {
			System.out.println(i);
			}
		}
	}
}
