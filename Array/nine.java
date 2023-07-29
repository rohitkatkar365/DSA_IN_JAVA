public class nine {
    public static void pairsubarray(int arr[])
    {
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            int s = i;
            for (int j = i; j < arr.length; j++) {
               int e = j;
               for (int k = s; k <= e; k++) {
                   System.out.print(arr[k]+" ");
               }
               pair++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total No of pair is:- "+pair);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairsubarray(arr);

    }    
}
 