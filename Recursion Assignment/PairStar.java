public class solution {

	public static String addStars(String s) {

        if(s.length()==1)
        {
            return s;
        }
        
        String small = addStars(s.substring(1));
        if(small.charAt(0)==s.charAt(0))
        {
            return s.charAt(0)+"*"+small;
        }
        return s.charAt(0)+small;
	}
}
