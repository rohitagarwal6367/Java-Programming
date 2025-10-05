
public class InvertedhalfPiramid {

    public static void hollow_rectangle(int n) {
        for (int i = 1; i <= n; i++) {      // outer loop
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {   // stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        hollow_rectangle(10);
    }
}
