public class ten {
    public static void maxsumofsubarray(int arr[])
    {
        // Brute Force
        int currentsum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int s = i;
            for (int j = i; j < arr.length; j++) {
               int e = j;
               currentsum = 0;
               for (int k = s; k <= e; k++) {
                   currentsum += arr[k];
               }
               System.out.println(currentsum);
               if (max < currentsum) {
                max = currentsum;
               }
            }
        }
        System.out.println("Max Sum IS:- "+max);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxsumofsubarray(arr);

    }    
}
 