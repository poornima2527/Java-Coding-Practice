public class ShortestWord {

    public static String findShortestWord(String s) {

        String[] words = s.trim().split("\\s+");
        String shortest = words[0];

        for (String w : words) {
            if (w.length() < shortest.length())
                shortest = w;
        }
        return shortest;
    }
}
