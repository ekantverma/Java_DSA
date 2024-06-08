import java.util.*;

public class l523 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum % k)) {
                // check the size
                int index = map.get(sum % k);
                if (i - index >= 2) {
                    return true;
                } else {
                    map.put(sum % k, i); // store the first occurance
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int nums[] = { 23, 2, 4, 6, 7 };
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }
}
