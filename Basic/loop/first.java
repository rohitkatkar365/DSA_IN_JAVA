public class first
{
    public static void main(String[] args)
    {
        /*
         * another way
         * int n = 0;
         * while(n < 10)
         * {
         *      System.out.print("Hello\n");
         *      n++;
         * }
         * System.out.print("End");
         */
        int n = 10;
        while(n != 0)
        {
            System.out.println("Hello!\n"+n);
            n--;
        }
        System.out.println("Complete Printing\n");
    }
}