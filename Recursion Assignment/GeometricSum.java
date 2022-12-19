public class solution {

	public static double findGeometricSum(int k){
		if(k==0)
		{
			return 1/(Math.pow(2,k));
		}
        
		double sum = findGeometricSum(k-1);
		double ans = 1/Math.pow(2,k)+sum;
		
	
	return ans;
	}
}
