import java.util.Scanner;
public class Demo020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = scanner.nextInt();
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 1; i <= terms; i++) {
            sum += first;
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println("Sum of Fibonacci series up to " + terms + " terms is: " + sum);
        scanner.close();
    }
}
