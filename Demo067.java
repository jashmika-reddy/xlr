public class Demo067 {
    public static void main(String[] args) {
        int[] numbers = {11,12,13,14,15,16,17};
        System.out.println("Even Elements:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
