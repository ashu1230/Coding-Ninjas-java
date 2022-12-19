import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        char c;
        int i;
        Scanner sc = new Scanner(System.in);
        c= sc.next().charAt(0);
        i=c;
        if(i>=65 && i <=90)
        {
            System.out.println("1");
        }
        else if(i>=97 && i<=122)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("-1");
        }

    }
}
