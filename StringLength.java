public class StringLength {

    public static int findLength(String s) {

        int count = 0;

        for (char c : s.toCharArray()) {
            count++;
        }
        return count;
    }
}
