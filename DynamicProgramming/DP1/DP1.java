package DynamicProgramming.DP1;

import java.util.Arrays;

public class DP1 {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibMemo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fibMemo(n - 1, dp) + fibMemo(n - 2, dp);
        return dp[n];
    }

    public static int fibTab(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            dp[n] = fibTab(n - 1, dp) + fibTab(n - 2, dp);
        }
        return dp[n];
    }

    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(countWays(n));
    }
}