import javax.swing.SwingContainer;

public class seventh {
    public static void reversearray(int arr[])
    {
        int s = 0;
        int e = arr.length - 1;
        while(s < e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.print("Original array:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reversearray(arr);
        System.out.print("Reversed Array:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
}
