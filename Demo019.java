import java.util.Scanner;
public class Demo019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int nextMultiple = (number % 5 == 0) ? number + 5 : (number + (5 - number % 5));
        System.out.println("The next multiple of 5 after " + number + " is " + nextMultiple);
        scanner.close();
    }
}
