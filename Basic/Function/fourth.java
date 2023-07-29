import java.util.*;
public class fourth
{
    public static boolean isprime1(int n) 
    {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
            {
                return true;
            }
        }
        return false;
    }
    public static void printrange(int n)
    {
        int i;
        for (i = 2; i <= n; i++) 
        {
            if(isprime1(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     printrange(n); 
    }
}