package Stacks;

import java.util.*;

public class StacksQn {
    // Qs - 1 | Amazone
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Qs - 2 | Reverse a string using stack (Ms, Amazone, Paytm, Adobe, Flipkart)
    public static String reverseStr(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();

    }

    // Qs - 3 | Reverse a Stack (Amdocs)
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStacks(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    // Qs - 4 | Stock span problem (Amazone, Adobe, Ms, Samsung , Flipkart)
    public static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        // s.push(0);

        for (int i = 0; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
        // printStacks(s);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
    }
}
