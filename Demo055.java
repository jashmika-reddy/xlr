import java.util.Scanner;
class Demo055 {
    int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;  
            sum += digit * digit;  
            num /= 10;             
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        Demo055 obj = new Demo055();
        int result = obj.sumOfSquares(number);
        System.out.println("Sum of squares of digits: " + result);
        scanner.close();
    }
}