public class acronym {

    public static String makeAcronym(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            if (!w.isEmpty())
                sb.append(Character.toUpperCase(w.charAt(0)));
        }
        return sb.toString();
    }
}
