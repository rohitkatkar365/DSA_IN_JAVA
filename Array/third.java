public class third {
    public static int linearsearch(int arr[],int key)
    {
        //serach key
        for (int i = 0; i < arr.length; i++) {
            //if found
            if (arr[i] == key) {
                return i;
            }
        }
        // if not found
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        // key 
        int key = 1;
        int ans = linearsearch(arr, key);
        // if not found
        if (ans == -1) {
            System.out.print("Element is not found at location:- "+ans);
        }
        // if element found
        else {
            System.out.print("Element is found at location:- "+ans);

        }
    }
}
