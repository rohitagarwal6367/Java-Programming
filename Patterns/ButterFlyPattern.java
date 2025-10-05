public class ButterFlyPattern {
    public static void ButterFly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");  // Corrected: use print, not println
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" "); // Corrected: use print, not println
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }
    }

    public static void main(String args[]) {
        ButterFly(5);
    }
}
