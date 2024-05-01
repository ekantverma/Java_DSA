public class l2000 {

    public static String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) { // If character ch is not found, return the original string
            return word;
        }
        StringBuilder newStr = new StringBuilder(word.substring(0, idx + 1)).reverse();
        newStr.append(word.substring(idx + 1));
        return newStr.toString();
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));
    }
}
