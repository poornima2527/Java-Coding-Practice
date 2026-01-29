public class  removechar {

    public static String removeChar(String s, char ch) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != ch)
                sb.append(c);
        }
        return sb.toString();
    }
}
