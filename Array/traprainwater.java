public class traprainwater {
    public static int traprainwater(int arr[])
    {
        // Calculate left max boundary array
        int left[] = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i-1],arr[i]);
        }
       // Calculate right max boundary array 
       int right[] = new int[arr.length];
        right[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--) {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        int trapwater = 0;
        //loop
        for (int i = 0; i < arr.length; i++) {
            int waterlevel = Math.min(right[i],left[i]);
            trapwater += waterlevel - arr[i];
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.print(traprainwater(height));
    }
}
