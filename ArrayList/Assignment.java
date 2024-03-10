package ArrayList;

import java.util.*;

public class Assignment {
    public static boolean isMonotonic(ArrayList<Integer> arr) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                inc = false;
            } else if (arr.get(i) < arr.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        System.out.println(isMonotonic(arr));
    }
}
