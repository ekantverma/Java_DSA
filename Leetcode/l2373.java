import java.util.*;

public class l2373 {
    public static int[][] largestLocal(int[][] grid) {
        // We have to return [[9,9],[8,6]] for given grid
        int ans[][] = new int[3][3];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                int temp[][] = new int[3][3];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        temp[k][l] = grid[i + k][j + l];
                    }
                }
                ans = max(ans, temp);
            }
        }
        return ans;
    }

    private static int[][] max(int[][] ans, int[][] temp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'max'");
    }

    public static void main(String[] args) {
        int grid[][] = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } };

        System.out.println(largestLocal(grid).toString());
    }
}
