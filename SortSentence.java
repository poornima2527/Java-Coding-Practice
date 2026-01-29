import java.util.Scanner;

public class SortSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    int pos = c - '0';
                    result[pos] = word.replaceAll("[0-9]", "");
                }
            }
        }

        System.out.println(String.join(" ", result));
    }
}
