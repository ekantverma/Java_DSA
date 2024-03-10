package Stacks;

import java.util.*;

public class NextGreaterEle {
    // QS - 5 | Next Greater Element (Very very Important Logic and IMP Question)
    // O(2n)
    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 8, 9, 5 };
        Stack<Integer> s = new Stack<>();
        int nxtGrtEle[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2 if else
            if (s.isEmpty()) {
                nxtGrtEle[i] = -1;
            } else {
                nxtGrtEle[i] = arr[s.peek()];
            }
            // 3 push in stack
            s.push(i);
        }

        // Print arr
        for (int j = 0; j < arr.length; j++) {
            System.out.print(nxtGrtEle[j] + " ");
        }
        System.out.println();
    }
}
