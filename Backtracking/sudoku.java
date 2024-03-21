public class sudoku {

    public static int ratSolver(int row, int col, int n, int m) {
        // Base Case
        if (row == n - 1 && col == m - 1) {
            return 0;
        }

        // Recursion
        int w1 = ratSolver(row + 1, col, n, m);
        int w2 = ratSolver(row, col + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(ratSolver(0, 0, n, m));
    }
}
