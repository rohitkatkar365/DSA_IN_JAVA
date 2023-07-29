import java.util.*;

class third{
  public static void bionomialcoeficient(int n,int r)
  {
    int a = factorial(n);
    int b = factorial(r);
    int c = factorial(n-r);

    float fact = a / (a * (c));
   
  }

  public static void main(String[] args) {
  int n,r;
  Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    r = sc.nextInt();
    System.out.println(bionomialcoeficient(n,r));
   
  }
}