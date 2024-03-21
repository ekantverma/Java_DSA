public class nQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal Right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueen(char board[][], int row) {
        // TC = O(n!)
        // Base case
        if (row == board.length) {
            // printArr(board);
            // count++;
            return true;
        }

        // Column Loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueen(board, row + 1)) { // Functional Call
                    return true;
                }
                board[row][j] = 'X'; // Backtracking Step
            }
        }
        return false;
    }

    public static void printArr(char board[][]) {
        System.out.println("------ chess Board ------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // static int count = 0;

    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];
        // Initialization
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if (nQueen(board, 0)) {
            System.out.println("Solution is possible");
        } else {
            System.out.println("Solution is not possible");
        }
        // System.out.println("Total ways to solve n queens : " + count);
    }
}