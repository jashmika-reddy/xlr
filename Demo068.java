public class Demo068 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35, 40};
        int evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of Even Numbers: " + evenCount);
    }
}