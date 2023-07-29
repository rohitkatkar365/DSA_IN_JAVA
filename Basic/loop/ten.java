import java.util.*;
public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if(i%10==0)
            {
                break;
            }
            System.out.print(i+" ");
        }
    }
}
