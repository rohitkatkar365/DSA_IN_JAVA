public class second {
    public static void update(int arr[])
    {
        // Loop Used For Traverse + Add 1
        for (int i = 0; i < arr.length; i++) { //arr.length find acctual size of array
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {97,98,99};
        // Print original array
        System.out.println("Original array:- \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        update(arr);
        
        // for print updated array
        System.out.println("Updated array:- \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


// *** Array always pass by reference