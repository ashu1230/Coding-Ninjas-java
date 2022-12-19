import java.util.Scanner;
public class Solution {
	
	public static boolean checkMember(int n){
				
		int a = 0;
        int b = 1;
        
        while(a<n){
            int c = a+b;
            a=b;
            b=c;
            
            
        }
        if(n==a)
        {
            return true;
        }
        else
            return false;

	}
    
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        boolean answer = checkMember(n);
        System.out.println(answer);
    }
	

}
