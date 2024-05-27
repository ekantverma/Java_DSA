import java.util.*;

public class l1608 {
    // Input:nums=[3,5]Output:2 Explanation:
    // There are 2
    // values (3 and 5) that are greater than or equal to 2.

    // Input:nums=[0,4,3,0,4]
    // Output:3
    // Explanation:
    // There are 3
    // values that
    // are greater
    // than or
    // equal to 3

    public static int specialArray(int nums[]) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] <= nums[j]) {
                    count++;
                }
            }
            if (count == nums[i]) {
                return nums[i];
            } else {
                count = 0;
            }
            count = 0;
        }
        return -1;
    }

    // from binary search and sorting approach
    public static int specialArray2(int nums[]) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] >= n - i) {
                return n - i;
            }
        }
        return -1;
    }

    // best approach to handle all the test cases
    public static int specialArray3(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= n - i) {
                return n - i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 4, 3, 0, 4 };
        System.out.println(specialArray3(nums));
    }
}
