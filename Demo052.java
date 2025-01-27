import java.util.Scanner;
public class Demo052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number, result = 0;
        int digits = String.valueOf(number).length(); 
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits); 
            number /= 10;
        }
        if (original == result) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        scanner.close();
    }
}

