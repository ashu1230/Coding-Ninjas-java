import java.util.Scanner;
public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		
        int temp = 0;
        for(int i =start;i<=end;i+=step)
        {
            temp = (int)((i-32) * 0.5555556);
            System.out.println(i+"\t"+temp);
        }
        return;
		
	}
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
        
        printFahrenheitTable(s,e,w);
    }
}
