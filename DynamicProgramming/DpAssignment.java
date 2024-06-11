public class DpAssignment {
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static void tribonacciSequence(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(dp[i] + " ");
        }
    }

    public static void printParenthisis(char str[], int n) {
        if (n > 0) {
            printParenthisisUtil(str, 0, n, 0, 0);
            return;
        }
    }

    public static void printParenthisisUtil(char str[], int pos, int n, int open, int close) {
        if (close == n) {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
            return;
        } else {
            if (open > close) {
                str[pos] = '}';
                printParenthisisUtil(str, pos + 1, n, open, close + 1);
            }
            if (open < n) {
                str[pos] = '{';
                printParenthisisUtil(str, pos + 1, n, open + 1, close);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        char[] str = new char[2 * n];
        printParenthisis(str, n);
    }
}
