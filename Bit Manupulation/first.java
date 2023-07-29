
public class first {
    public static int getithbit(int n,int i)
    {
        int bitmask = 1<<i;
        System.out.println(bitmask);
        int get = (n & bitmask);
        System.out.println(get);
        if (get == 0) {
            return 0;
        }
        else
    {
        return 1;
    }
    }
    public static void main(String[] args) {
        System.out.println(getithbit(10,3));        
    }
}
