// for i/p library
import java.util.*;
public class fifth {
    public static void main(String args[])
    {
        // create an object (for use of access)
        Scanner obj = new Scanner(System.in);
        // for integer i/p
        int a = obj.nextInt();
        System.out.println("Value Of A Is: "+a);
        //for byte i/p
        byte b = obj.nextByte();
        System.out.println("Value Of b Is: "+b);
        // for boolean i/p
        boolean c = obj.nextBoolean();
        System.out.println("Value Of c Is: "+c);
        // for float i/p
        float d = obj.nextFloat();
        System.out.println("Value Od d Is: "+d);
        // for double i/p
        double e = obj.nextDouble();
        System.out.println("Value Of e Is: "+e);
        // for long i/p
        long f = obj.nextLong();
        System.out.println("Value Od f Is: "+f);
        // for short i/p
        short g = obj.nextShort();
        System.out.println("Value Of g Is: "+g);
        // for char & string i/p
        String h = obj.next();
        System.out.println("Value Of f Is: "+h);
    }
}
