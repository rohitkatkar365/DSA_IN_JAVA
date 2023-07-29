public class third {
    public static void main(String[] args) {
       /*
            1
            1 2
            1 2 3
            1 2 3 4
       */ 
      int n = 4;
      for (int line = 1; line <= n; line++) {
        
        for (int star = 1; star <= line; star++) {
            System.out.print(star+" ");
        }
        System.out.println();
      }
    }
}
