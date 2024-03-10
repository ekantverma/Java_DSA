package Stacks;

import java.util.*;

public class MaxAreaInHistogram { // *** Qs - 7 | (Ms, Facebook, Paytm snapdeal, oyo, etc...) O(n)
    public static void maxArea(int height[]) {
        int maxArea = 0;
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];
        // Next smaller Next
        Stack<Integer> s = new Stack<>();
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next smaller right
        s = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area | area = (Widh nsr[i] - nsl[i] - 1) * height
        for (int i = 0; i < height.length; i++) {
            maxArea = Math.max(maxArea, (nsr[i] - nsl[i] - 1) * height[i]);
        }
        System.out.println(maxArea);

    }

    public static void main(String[] args) {
        int height[] = { 2, 4 };
        maxArea(height);
    }
}
