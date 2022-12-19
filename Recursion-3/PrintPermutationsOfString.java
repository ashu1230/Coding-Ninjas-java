package practice;

public class PrintPermutations {
	public static void permutations(String input){
		print(input,"");

	}

	public static void print(String input,String output)
	{
		if(input.length()==0)
		{
			System.out.println(output);
			return;
		}

		for(int i =0;i<input.length();i++)
		{
			char c = input.charAt(i);
			String remaining = input.substring(0, i)+input.substring(i+1);
			
			print(remaining,output+c);
		}
		
		
	}

	public static void main(String[] args) {
		permutations("abc");
	}

}
