package dp;

public class MinStepsToOne {
	
	public static int count(int n)
	{
		 if(n<=1)
	        {
	            return 0;
	        }

	        if(n==2)
	        {
	            return 1;
	        }
	        if(n==3)
	        {
	            return 1;
	        }
			int a;
	        int b= Integer.MAX_VALUE;
	        int c=Integer.MAX_VALUE;
	        a = count(n-1);
	        if(n%2==0)
	        {
	            b = count(n/2);   
	        }
	        if(n%3==0)
	        {
	            c=count(n/3);
	        }

	        return 1+ Math.min(a,Math.min(b,c));
	    }

	public static void main(String[] args) {
		System.out.println(count(10));

	}

}
