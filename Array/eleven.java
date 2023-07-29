public class eleven {
    public static void maxsumofsubarray(int arr[]) {
        // Brute Force
        int currentsum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int s = i;
            for (int j = i; j < arr.length; j++) {
                int e = j;
                currentsum = (s == 0)?prefix[e]:prefix[e] - prefix[s-1];
                if (max < currentsum) {
                    max = currentsum;
                }
            }
        }
        System.out.println("Max Sum IS:- " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxsumofsubarray(arr);

    }
}
