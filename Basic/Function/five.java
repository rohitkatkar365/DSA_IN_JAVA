public class five {
    public static void bintodec(int bin)
    {
        int pow = 0;
        int dec = 0;
        while(bin!=0)
        {
            int digit = bin % 10;
            dec = dec +(digit *(int)Math.pow(2,pow));
            pow++;
            bin/=10;
        }
        System.out.println("Binary is "+dec);
    }
    public static void main(String[] args) {
        bintodec(101);
    }
}
