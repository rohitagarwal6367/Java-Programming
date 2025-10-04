import java.util.*;

public class Range{

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true; // 2 is prime
        } else if (n < 2) {
            return false; // numbers less than 2 are not prime
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) { // or i <= Math.sqrt(n)
                if (n % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
            return isPrime; 
        }
    }
    
    public static void primeInRange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

       primeInRange(n);

        sc.close();
    }
}

