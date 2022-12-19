import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
 double bs,hra,da,pf,fs;
 int allow,printsalary;
 char grade;
 Scanner sc = new Scanner(System.in);
 bs = sc.nextDouble();
grade = sc.next().charAt(0);
hra=0.20*bs;
da=0.50*bs;
pf=0.11*bs;
if(grade=='A')
{
	allow = 1700;
	fs = bs+hra+da+allow-pf;
	printsalary = (int)Math.round(fs);
	System.out.println(printsalary);
}
else if(grade=='B')
{
	allow = 1500;
	fs = bs+hra+da+allow-pf;
	printsalary = (int)Math.round(fs);
	System.out.println(printsalary);
}
else
{
	allow = 1300;
	fs = bs+hra+da+allow-pf;
	printsalary = (int)Math.round(fs);
	System.out.println(printsalary);
}
 
	}

}
