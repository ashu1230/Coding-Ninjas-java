import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
    int number,number1;
        int i =1;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while(0<=number && number<=10000 && i<=10)
        {
            number1 = number*i;
            i=i+1;
            System.out.println(number1);
        }

	}
}
