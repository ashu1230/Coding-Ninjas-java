public class RemoveX {
	public static String removeX(String input){
		// Write your code here
        if(input.length()==0)
        {
            return input;
        }
        
        String smallO = removeX(input.substring(1));
        if(input.charAt(0)=='x')
        {
        	return smallO;
        }
        else
        	return input.charAt(0)+smallO;
        

	}
	public static void main(String[] args) {
		System.out.println(removeX("xaxb"));

	}

}
