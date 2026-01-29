public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 5};
        int min = arr[0];
        int second = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                second = min;
                min = arr[i];
            } 
            else if (arr[i] > min && arr[i] < second) {
                second = arr[i];
            }
        }
        System.out.println("Second Smallest = " + second);
    }
}


