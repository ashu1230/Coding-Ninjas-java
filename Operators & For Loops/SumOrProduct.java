import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your code here
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int choice;
        choice = sc.nextInt();

        if(choice==1)
        {
            int sum = 0;
            int i = 1;
            while(i<=n)
            {
                sum = sum+ i;
                i=i+1;
            }
            System.out.println(sum);
        }
        

        else if(choice == 2)
        {
            int product = 1;
            int i = 1;
            while(i<=n)
            {
				product = product * i;
                i+=1;
            }
            System.out.println(product);
        }
        else
        {
            System.out.println("-1");
        }

    }
}
