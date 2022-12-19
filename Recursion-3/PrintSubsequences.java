package practice;

public class PrintSubsequences {
	
	public static void PrintSub(String input,String OutputSoFar)
	{
		if(input.length()==0)
		{
			System.out.println(OutputSoFar);
			return;
		}
		
		PrintSub(input.substring(1),OutputSoFar);
		PrintSub(input.substring(1), OutputSoFar+input.charAt(0));
	}
	
	public static void PrintSub(String input)
	{
		PrintSub(input,"");
	}

	public static void main(String[] args) {
		PrintSub("xyz");

	}

}
