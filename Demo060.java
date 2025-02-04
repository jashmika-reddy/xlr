public class Demo060 {
    public static void main(String[] args) {
        int n = 20; 
        long firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series of " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
