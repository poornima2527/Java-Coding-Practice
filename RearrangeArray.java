import java.util.*;

public class RearrangeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int left = 0, right = n - 1;
        int[] result = new int[n];
        int index = 0;

        while (left <= right) {
            if (left != right)
                result[index++] = arr[right--];
            result[index++] = arr[left++];
        }

        System.out.println(Arrays.toString(result));
    }
}
