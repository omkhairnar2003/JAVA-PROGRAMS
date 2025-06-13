import java.util.Scanner;

public class DigitFactorialSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i; 
            }
            sum += factorial;
            num /= 10;
        }
        
        System.out.println("Sum of factorials of digits: " + sum);
    }
}