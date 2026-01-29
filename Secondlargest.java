// Day -1 : 
// 1) Find the Second Largest Number
public class Secondlargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};
        int max = arr[0];
        int second = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } 
            else if (arr[i] < max && arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("Second Largest = " + second);
    }
}

    

