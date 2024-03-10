package Stacks;

import java.util.*;

// Qs - 7
public class DuplicateParthe { // Imp Qs - (Google, Amz, Paytm, Ms, Adobe) O(n)

    public static boolean isDuplicate(String str) { // O(n)
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') { // (s.pop() add this line )
                    s.pop(); // (remove this line )
                    count++;
                }
                if (count < 1) { // duplicate exist
                    return true;
                } else { // (Then remove this else case completely)
                    s.pop(); // Opening bracket
                }
            } else {
                // Opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))"; // True
        String str2 = "((a+b)+ (c+d))"; // False
        System.out.println(isDuplicate(str1));
    }
}
