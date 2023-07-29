import java.util.*;
public class third {
    public static boolean checkpalindrome(String s)
    {
        int st = 0;
        int e = s.length()-1;
        while(st < e)
        {
            if(s.charAt(st) != s.charAt(e))
            {
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(checkpalindrome(s));
    }
}
