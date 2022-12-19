import java.util.Scanner;
public class Solution {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        {
            int n = sc.nextInt();
            int firsthalf = (n+1)/2;
            int secondhalf= firsthalf-1;
            
            //first half
            
            int currRow=1;
            while(currRow<=firsthalf)
            {
                int spaces =1;
                while(spaces<=(firsthalf-currRow))
                {
                    System.out.print(" ");
                    spaces = spaces + 1;
                }
                int currCol = 1;
                while(currCol<=(2*currRow)-1)
                {
                    System.out.print('*');
                    currCol = currCol + 1;
                }
                System.out.println();
                currRow = currRow + 1;
            }
            //second half
            
            currRow = secondhalf;
            while(currRow>=1)
            {
                int spaces = 1;
                while(spaces<=(secondhalf-currRow + 1))
                {
                    System.out.print(' ');
                    spaces = spaces + 1;
                    
                }
                int currCol = 1;
                while(currCol<=(2*currRow)-1)
                {
                    System.out.print('*');
                    currCol = currCol + 1;
                }
                System.out.println();
                currRow = currRow - 1;
            }
        }
    }
}
