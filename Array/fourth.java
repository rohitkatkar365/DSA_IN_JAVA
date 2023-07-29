public class fourth{
    public static String linearsearch(String arr[],String key)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return "True";
            }
        }
        return "False";
    }
    public static void main(String[] args) {
        String arr[] = {"Krishna","Arjun"};
        String key = "Arjun";
        String ans = linearsearch(arr, key);
        if (ans == "False")
         {
            System.out.print("Element is not found at location:- "+ans);
        } else {
            System.out.print("Element is found at location:- "+ans);
        }
    }
}
