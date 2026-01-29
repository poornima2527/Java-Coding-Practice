import java.util.Scanner;

public class RemoveVowels {

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (isVowel(c)) {
                boolean prev = i > 0 && isVowel(s.charAt(i - 1));
                boolean next = i < s.length() - 1 && isVowel(s.charAt(i + 1));

                if (prev || next)
                    result.append(c);
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
