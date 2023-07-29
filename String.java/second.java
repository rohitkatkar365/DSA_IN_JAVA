import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.print(name);
        System.out.println();
        // Length
        System.out.println("Size Of String Is:- "+name.length());
        // Concatenation
        String b = "Katkar";
        System.out.println(name+b);
        // Find Character At index
        System.out.println(name.charAt(0));
    }
}
