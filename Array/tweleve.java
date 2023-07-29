
public class tweleve {
    public static void kadanalgo(int arr[])
    {
        
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i <arr.length; i++) {
            currentSum += arr[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-2,4,-1,-2,1,5,-3};
        kadanalgo(arr);
    }
}
