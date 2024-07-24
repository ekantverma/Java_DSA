import java.util.HashSet;

public class Remove_Duplicate_From_sortedArray {
    public static int[] removeElement(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length - 1; i++) {
            set.add(arr[i]);
        }

        // set to array
        
        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }
        return arr; // return modified array with unique elements
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 1, 2, 2, 2, 3 };
        System.out.println(removeElement(nums).toString());
    }
}
