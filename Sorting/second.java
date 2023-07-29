public class second{
    public static void bubblesort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                int temp;
                if(arr[j] > arr[j+1])
                {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap = true;
                }
            }
            if(swap == false)
            {
                System.out.print("Already Sorted\n");
                break;
            }
        }
    }
    public static void selectionsort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
           int min = i;
            for (int j = i+1; j < arr.length; j++) {
                //increasing order
                if(arr[min] > arr[j])
                {
                   min = j; 
                }
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void insertionsort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = i -1;
            while (pre >= 0 && arr[pre] > curr) {
                arr[pre++] = arr[pre];
                pre--;
            }
            arr[pre++] = curr;
        }
    }
    public static void printsortedarray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1,2,4,7,5};
        bubblesort(arr);
        printsortedarray(arr);
        System.out.println();
        selectionsort(arr);
        printsortedarray(arr);
        System.out.println();
        insertionsort(arr);
        printsortedarray(arr);
    }
}
