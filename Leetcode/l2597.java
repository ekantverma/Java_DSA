import java.util.ArrayList;
import java.util.List;

public class l2597 {
    public static int beautifulSubsets(int[] nums, int k) {
        return countBeautifulSubsets(nums, k, 0, new ArrayList<>());
        // List<Integer> current = new ArrayList<>();
        // return countBeautifulSubsets(nums, k, 0, current);
    }

    private static int countBeautifulSubsets(int[] nums, int k, int start, List<Integer> current) {

        int count = 0;

        // Check if the current subset is beautiful and non-empty
        if (!current.isEmpty() && isBeautiful(current, k)) {
            count++;
        }

        // Generate all subsets
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            count += countBeautifulSubsets(nums, k, i + 1, current);
            current.remove(current.size() - 1);
        }

        return count;

        // int count = 0;

        // // Check if the current subset is beautiful
        // if (isBeautiful(current, k)) {
        // count++;
        // }

        // // Extend the current subset with valid elements
        // for (int i = start; i < nums.length; i++) {
        // current.add(nums[i]);
        // count += countBeautifulSubsets(nums, k, i + 1, current);
        // current.remove(current.size() - 1);
        // }

        // return count;
    }

    private static boolean isBeautiful(List<Integer> subset, int k) {
        // Check if the subset is beautiful
        for (int i = 0; i < subset.size(); i++) {
            for (int j = i + 1; j < subset.size(); j++) {
                if (Math.abs(subset.get(i) - subset.get(j)) == k) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6 };
        int k = 2;
        System.out.println(beautifulSubsets(nums, k));
    }
}
