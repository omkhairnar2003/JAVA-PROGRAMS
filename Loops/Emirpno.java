import java.util.Scanner;

class Emirp {
    public static void main(String[] args) {
        System.out.println("Enter the num:");
        int num = new Scanner(System.in).nextInt();
        int dup = num;
        int rev = 0;

        // Check if the original number is prime
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int den = 2; den <= num / 2; den++) {
                if (num % den == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Reverse the number
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        // Check if the reversed number is prime
        boolean isRevPrime = true;
        if (rev <= 1) {
            isRevPrime = false;
        } else {
            for (int den = 2; den <= rev / 2; den++) {
                if (rev % den == 0) {
                    isRevPrime = false;
                    break;
                }
            }
        }

        // Output the results
        System.out.println("Reversed number: " + rev);
        if (isPrime && isRevPrime) {
            System.out.println(dup + " is an Emirp number.");
        } else {
            System.out.println(dup + " is not an Emirp number.");
        }
    }
}