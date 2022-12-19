public class solution {

	public static int countZerosRec(int input){
		if(input<10)
		{
			if(input==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
		}
		int count = 0;
	
		if(input%10==0)
		{
			count++;
		}
		int fi = countZerosRec(input/10);
		return count+fi;
	}
}
