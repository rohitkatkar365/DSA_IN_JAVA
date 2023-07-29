import java.util.*;
public class first {
    public static void search(int arr[][],int key)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]==key) {
                    System.out.print("("+i+","+j+")");
                }
            }
        }
   
    }
    public static void main(String[] args) {
        // Creation Of 2D Array
        int n = 3,m = 3;
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        int key = 3;
        search(arr, key);
        System.out.println();
    }
}
