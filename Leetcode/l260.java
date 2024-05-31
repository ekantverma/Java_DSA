import java.util.HashSet;
import java.util.Set;

public class l260 {
    // Here we have to return the single appeared value of array
    public static int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        int[] result = new int[2];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 5, 2 };
        // ans : [1,2,1,3,2,5]
        System.out.println(singleNumber(nums));
    }
}