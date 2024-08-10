public class iii_shortestPath {

    public static int ShortestPath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            }

        }
        int x2 = x * x;
        int y2 = y * y;

        return(int) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(ShortestPath(str));
    }
}
