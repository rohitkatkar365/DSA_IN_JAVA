
public class thirteen {
    public static void main(String[] args) {
        int n = 4;
        boolean res = true;
        for (int i = 2; i < n-1; i++) {
            if(n%i==0)
            {
                res = false;
            }
            else
            {
                res = true;
            }
        }
        if (res) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
/*
 * for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0)
            {
                res = false;
            }
            else
            {
                res = true;
            }
        }
 */