import java.util.*;

public class l34 {

    public static int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {};
        int target = 0;

        int ans[] = searchRange(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
