public class WordCount {

    public static int countWords(String s) {

        s = s.trim();
        if (s.isEmpty()) return 0;

        return s.split("\\s+").length;
    }
}
