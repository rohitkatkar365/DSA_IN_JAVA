

public class fourth {
    public static void main(String[] args) {
        /*
         * syntax
         * variable = (condition)?statement1:statement2;
         */
        int a = 2;
        String s = (a%2==0)?"Even":"ODD";
        System.out.println(s);
        int b=2,c=3;
        int q = (a>c)?a:c;
        System.out.println(q);
    }
}
