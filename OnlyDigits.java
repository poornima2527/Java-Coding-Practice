public class OnlyDigits {

    public static boolean containsOnlyDigits(String s) {

        if (s.isEmpty()) return false;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
