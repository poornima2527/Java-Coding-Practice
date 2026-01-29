//DAY- 01 : 1) To swap the 0 in the last position in the given array [0,1,0,3,0,12] = [1,3,12,0,0,0].
public class Swap{
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,0,12};
        int j = 0;
        for(int i = 0; i<arr.length;i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                j++;
            }
        }
        for(int num : arr) {
                System.out.print(num + " ");
            }
    }
    
}
