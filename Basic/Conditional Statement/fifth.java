import java.util.*;

public class fifth
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char option = sc.next().charAt(0);
        switch (option) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
            System.out.println(a-b);
            break;
            default:
            System.out.println("null");
            break;
    }
}
}