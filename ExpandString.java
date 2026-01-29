public class ExpandString {

    public static String expand(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            char ch = s.charAt(i);
            int count = s.charAt(i + 1) - '0';

            for (int j = 0; j < count; j++)
                sb.append(ch);
        }
        return sb.toString();
    }
}
