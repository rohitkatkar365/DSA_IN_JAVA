public class seventh {
    public static void largestring(String s[])
    {
        String large = s[0];
        for (int i = 1; i < s.length; i++) {
            if(large.compareTo(s[i]) < 0)
            {
                large = s[i];
            }
        }
        System.out.println(large);
    }
    public static void main(String[] args) {
        String s[] = {"apple","mango","banana"};

        largestring(s);
    }
}
