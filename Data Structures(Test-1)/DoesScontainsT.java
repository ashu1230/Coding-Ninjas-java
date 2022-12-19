public class Solution {
    public static boolean checkSequence(String a, String b) {
        if(a.length()<b.length())
        {
            return false;
        }
        if(b.length()==0)
        {
            return true;
        }
        if(a.length()==0)
        {
            return false;
        }

        if(a.charAt(0)==b.charAt(0))
        {
            return checkSequence(a.substring(1),b.substring(1));
        }
        else
        {
            return checkSequence(a.substring(1),b);
        }
    }
}
