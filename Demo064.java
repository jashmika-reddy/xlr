import java.util.Arrays;
public class Demo064 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; 
        if (arr.length > 1) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        System.out.println("Array after swapping first and last element: " + Arrays.toString(arr));
    }
}