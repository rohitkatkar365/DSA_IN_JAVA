import java.util.*;
public class tweleve {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            int n  = sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.print(n+" ");
        }while(true);
    }   
}
