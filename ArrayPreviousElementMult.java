import java.util.Arrays;

class ArrayPreviousElementMult {
    public static void main(String args[]) {
        int[] arr = {7,4,5,6,2,1};
        int n=arr.length;
        int[] Prefix = new int[n];
        int[] Suffix = new int[n];
        int[] result = new int[n];
        Prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            Prefix[i] = Prefix[i - 1] * arr[i - 1];
        }
        Suffix[n-1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            Suffix[i] = Suffix[i+1]*arr[i+1];
        }
        for(int i = 0; i < n; i++) {
            result[i] = Prefix[i] * Suffix[i];
        }
        System.out.println(Arrays.toString(result));
    }
}