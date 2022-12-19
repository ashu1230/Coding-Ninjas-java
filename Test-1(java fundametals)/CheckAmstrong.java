import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digits = 0, num = n;
        while(num > 0) {
            digits++;
            num /= 10;
        }
        int newNum = 0;
        num = n;
        while(num > 0) {
            int last = num % 10;
            newNum += Math.pow(last, digits);
            num /= 10;
        }
        if(newNum == n) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
