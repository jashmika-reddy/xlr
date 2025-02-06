public class Demo063 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array
        
        if (arr.length == 0) {
            System.out.println("Array is empty.");
        } else {
            int sum = arr[0] + arr[arr.length - 1];
            System.out.println("Sum of first and last element: " + sum);
        }
    }
}

