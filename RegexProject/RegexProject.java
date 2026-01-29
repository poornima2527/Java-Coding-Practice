import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class RegexProject {
    public static void main(String[] args) throws Exception {
        String text = Files.readString(Path.of("input.txt"));

        extract("Emails", text, "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        extract("Phone Numbers", text, "\\b[6-9]\\d{9}\\b");
        extract("Dates", text, "\\b\\d{2}-\\d{2}-\\d{4}\\b");
        extract("URLs", text, "https?://[^\\s]+");
        extract("IP Addresses", text, "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b");
    }

    static void extract(String label, String text, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        List<String> list = new ArrayList<>();
        while (m.find()) {
            list.add(m.group());
        }
        System.out.println(label + ": " + list);
    }
}