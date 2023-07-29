public class sixth {
    // Brute Force
    public static void substring(String str,int s,int e)
    {
        String str2 = "";
        for (int i = s; i < e; i++) {
            str2 += str.charAt(i);
        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        String str = "abcd";
        int s = 0;
        int e = str.length()-2;
        substring(str,s,e);
        System.out.println(str.substring(0, 3));
    }
}
