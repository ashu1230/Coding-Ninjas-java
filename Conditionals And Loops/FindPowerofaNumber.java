import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
     int number;
		int power;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		power = sc.nextInt();
		
		int answer=1;
		
		int i = 1;
		while(i<=power)
		{
			answer = answer * number;
			i=i+1;
		}
		System.out.println(answer);
	}

}
