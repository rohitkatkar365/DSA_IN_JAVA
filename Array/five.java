import java.util.*;
public class five {
    public static int getlarge(int arr[])
    {
        // set to -infinity
        int large = Integer.MIN_VALUE;
        // set to +infinity
        int small = Integer.MAX_VALUE;
        //for find large element 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large)
            {
                large = arr[i];
            }
        }
        // for find smallest element
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] < small)
            {
                small = arr[j];
            }
        }  
        System.out.println("Smallest Element Is:- "+small);

        return large;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.print("Largest element Is:- "+getlarge(arr));
    }
}
