public class six {
    public static int binarysearch(int arr[],int key)
    {
        // Using Two pointer Approach
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) { 
            // find mid
            int mid = start + (end - start)/2;
            // if found
            if (arr[mid] == key) {
                return mid;
            }
            // search in right array
            else if (key > arr[mid]) {
                start = mid + 1;
            } 
            // search in left search
            else {
                end = mid - 1;
            }
        }
        // if not found
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        int key = 1;
        System.out.print("Index is:- "+binarysearch(arr,key));
    }    
}
