import java.util.*;

public class DP5 {
    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n + 1][m + 1];

        // Initialization
        dp[0][0] = true;
        // Pattern = " "
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }
        // s = " "
        for (int i = 1; i < m + 1; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 1];
            }
        }

        // bottom up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // Case -> ith = jth || jth char = '?'
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    if (p.charAt(j - 1) == '*') {
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[n][m];
    }

    // Catalans Number
    public static int catalansRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catalansRec(i) * catalansRec(n - i - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(catalansRec(n));
    }
}
