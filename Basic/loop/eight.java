public class eight {
    public static void main(String[] args) {
        // Reverse Integer
        int n = 10899;
        while (n!=0) { // n>0
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n/=10;
        }
    }
}
