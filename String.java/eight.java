public class eight {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            sc.append(i);
        }
    System.out.println(sc);
    //System.out.println(sc.capacity()); //34
    System.out.println(sc.length());    //26
        System.out.println(sc.reverse());
    }
}
