public class eight {
    public static void pairarray(int arr[])
    {
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
                pair++;
            }
            System.out.println();
        }
        System.out.print("Total No of pair is:- "+pair);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairarray(arr);
    }    
}
