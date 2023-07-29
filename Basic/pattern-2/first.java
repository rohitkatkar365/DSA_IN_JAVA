import java.util.*;
public class first {
    public static void hollowrect(int torow,int tocol)
    {
        for (int i = 1; i <= torow; i++) {
            for (int j = 1; j <=tocol; j++) {
                if (i== 1 || i==torow || j==1 || j==tocol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }  
    public static void invertandrotate(int torow,int tocol)
    {
        for (int i = 1; i <= torow; i++) {
            // Space
            for (int j = 1; j <=torow-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
    public static void halfnumpy(int torow,int tocol)
    {
        for (int i = 1; i <= torow; i++) { 
            for(int k = 1;k<=torow-i+1;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }  
    public static void floyd(int torow,int tocol)
    {
        int a = 1;
        for (int i = 1; i <= torow; i++) {
            // Space
           
            for (int k = 1; k <= i; k++) {
                System.out.print(a);
                a++;
            }
            //  for (int j = 1; j <=torow-i+1; j++) {
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }  
    public static void halfbutter(int torow,int tocol)
    {
        for (int i = 1; i <= torow; i++) { 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(torow-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = torow; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(torow-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        hollowrect(i,j);
        invertandrotate(i,j);
        halfnumpy(i,j);
        floyd(i, j);
        halfbutter(i, j);
    }
}
