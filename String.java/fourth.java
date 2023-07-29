public class fourth {
    public static float shortpath(String s)
    {
        int x=0,y=0;
        for (int i = 0; i <s.length(); i++) {
            char dir = s.charAt(i);
            if (dir == 'W') {
                x--;
            } 
            else if (dir == 'N') {
                y++;
            }
            else if (dir == 'S') {
                y--;
            }
            else {
                x++;
            }
            
        }
        int x1 = x*x;
            int y1 = y*y;
             return (float)(Math.sqrt(x1+y1));

    }
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.print(shortpath(s));
    }
}
