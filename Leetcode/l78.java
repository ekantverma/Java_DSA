import java.util.*;

public class l78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        subsets(res, list, nums, 0);
        return res;
    }

    public static void subsets(List<List<Integer>> res, List<Integer> list, int[] nums, int index) {
        res.add(new ArrayList<Integer>(list));
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            subsets(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> res = subsets(nums);
        System.out.println(res);
    }
}