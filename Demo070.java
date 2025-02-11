public class Demo070 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35, 40, 7, 11, 13};
        System.out.println("Prime Numbers in the Array:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}