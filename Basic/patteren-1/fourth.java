public class fourth{
    public static void main(String[] args) {
       /*
            1
            1 2
            1 2 3
            1 2 3 4
       */ 
      int n = 4;
      char c='A';
      for (int line = 1; line <= n; line++) {
        
        for (char star = 1; star <= line; star++) {
            System.out.print(c+" ");
            c++;
        }
        System.out.println();
      }
    }
}
