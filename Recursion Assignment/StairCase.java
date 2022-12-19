public class staircase {
	
	public static int staircase(int input)
	{
		if(input<=1)
		{
			return 1;
		}
		else if(input==2)
		{
			return 2;
		}
		
		int x = staircase(input-1);
		int y = staircase(input - 2);
		int z = staircase(input - 3);
		
		return x+y+z;
	}

	public static void main(String[] args) {
		
		System.out.println((staircase(4)));

	}

}
