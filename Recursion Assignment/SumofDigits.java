
public class solution {

	public static int sumOfDigits(int input){
	
	if(input/10 ==0)
	{
		return input;
	}
	
	int sum = sumOfDigits(input/10);
	int ans = sum+(input%10);
	return ans;

	}
}
