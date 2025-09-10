import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) {   //for (int i=2; i<=sqrt(n); i++) is also correct
                if (n % i == 0) { // n is a multiple of i(i not equal to 1 or n)

                    isPrime = false;
                }

            }
            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not a prime");
            }
        }
        sc.close();
    }
}