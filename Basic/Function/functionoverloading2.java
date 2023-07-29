class functionoverloading2
{
    // using different data type
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static float sum(float a,float b,float c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.0f, 2f, 3f));
    }
}