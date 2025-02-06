public class Demo069 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35, 40};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of All Elements: " + sum);
    }
}

