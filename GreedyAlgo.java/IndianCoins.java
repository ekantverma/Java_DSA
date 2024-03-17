import java.util.*;

public class IndianCoins { // Qs -5
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };

        // Array Sort in descending order
        Arrays.sort(coins, Collections.reverseOrder());

        int countOfCoins = 0;
        int amount = 599;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total Mins Coins used " + countOfCoins);
    }
}
