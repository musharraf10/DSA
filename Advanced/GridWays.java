public class GridWays {
    public static int GridWays1(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }
        int w1 = GridWays1(i + 1, j, n, m);
        int w2 = GridWays1(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 2, m = 2;
        System.out.println(GridWays1(0, 0, n, m));
    }
}
