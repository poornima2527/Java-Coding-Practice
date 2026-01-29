public class ReverseVowels {

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;

        while (l < r) {
            if (!isVowel(arr[l])) l++;
            else if (!isVowel(arr[r])) r--;
            else {
                char t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}
