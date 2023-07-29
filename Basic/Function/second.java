import java.util.*;


public class second {
    public static int intca(int a, int b) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        return sum;
      }
    public static void main(String[] args) {
        int a=2, b=2;
        int ans = intca(a, b);
        System.out.print(ans);
    }
}
